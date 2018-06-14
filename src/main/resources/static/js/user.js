var userTable;
$(document).ready(
    function() {
        userTable = $("#dataTables").DataTable(
            {
                dom : "iftlp",
                searching : false,
                order : [ [ 1, "asc" ] ],
                language : {
                    url : "static/language.lang"
                },
                ajax : {
                    url : "login/getUserList",
                    type : "GET",
                    dataSrc : "",
                },
                columnDefs : [
                    {
                        data : "userName",
                        targets : [ 0 ]
                    },
                    {
                        data : "pass",
                        targets : [ 1 ]
                    },
                    {
                        data : "tel",
                        orderable : false,
                        targets : [ 2 ]
                    },
                    {
                        data : "loginType",
                        orderable : false,
                        searchable : false,
                        targets : [ 3 ]
                    },
                    {
                        data : null,
                        className : "center",
                        render : function(data, type, row) {
                            return "<div class=\"am-btn-group am-btn-group-xs\">"
                                + "<button onclick=\"showEdit('" + data.userName + "','"
                                + data.tel + "','" + data.id + "')\" "
                                + "class=\"am-btn am-btn-default am-btn-xs am-text-secondary\">"
                                + "<span class=\"am-icon-pencil-square-o\"></span> 编辑"
                                + "</button>"
                                + "<button onclick=\"toDelete('" + data.id + "')\" "
                                + "class=\"am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only\">"
                                + "<span class=\"am-icon-trash-o\"></span> 删除"
                                + "</button>" + "</div>";
                        },
                        targets : [ 4 ],
                        orderable : false,
                        searchable : false,
                    } ],

            });


        // 表单验证
        var $form = $('#usermanage-form');

        $form.validator({
            // 表单提交的时候验证
            validateOnSubmit : true,

            submit : function() {
                var formValidity = this.isFormValid();
                if (formValidity) {
                    var saveValue = $("#usermanage-form").serialize();
                    $.ajax({
                        url : "regist/doRegist",
                        dataType : "json",
                        data : saveValue,
                        async : false,
                        type : "POST",
                        success : function(data) {
                            console.info(data.code);
                            if (data.code == 0) {
                                alert("保存成功！");
                                $("#doc-modal-1").modal("close");
                                userTable.ajax.reload(null, true);
                            } else {
                                alert("保存失败！ ");
                            }
                        }
                    });
                }
                // 防止传统表单提交
                return false;
            }
        });

        var validator = $form.data('amui.validator');

        $form.on('focusin focusout', '.am-form-error input', function(e) {
            if (e.type === 'focusin') {
                var $this = $(this);
                var offset = $this.offset();
                var msg = $this.data('foolishMsg') || validator.getValidationMessage($this.data('validity'));

            } else {
                // 去除验证样式
                $tooltip.hide();

            }
        });
    });

// 显示编辑页
function showEdit(username, tel, id) {
    if (username) {
        $("#usertitle").html("修改用户");
        $(".ryt-star").addClass("am-hide");
        $("#teldiv").html("<input type=\"text\" id=\"tel\" name=\"tel\" class=\"am-input-sm\" >");
        $("#pswdiv").html("<input type=\"password\" id=\"password\" name=\"pass\" class=\"am-input-sm\" pattern=\"^[a-zA-Z0-9]+$\">");
        $("#repswdiv").html("<input type=\"password\" class=\"am-input-sm\"  pattern=\"^[a-fA-Z0-9]+$\" data-equal-to=\"#password\" >");
        $("#userdiv").html("<input id=\"username\" name=\"userName\" type=\"text\" class=\"am-input-sm am-form-field\" readonly=\"readonly\" >");
    } else {
        $("#usertitle").html("新增用户");
        $(".ryt-star").removeClass("am-hide");
        $("#teldiv").html("<input type=\"text\" id=\"tel\" name=\"tel\" class=\"am-input-sm\" >");
        $("#pswdiv").html("<input type=\"password\" id=\"password\" name=\"pass\" class=\"am-input-sm\" pattern=\"^[a-zA-Z0-9]+$\" required>");
        $("#repswdiv").html("<input type=\"password\" class=\"am-input-sm\"  pattern=\"^[a-fA-Z0-9]+$\" data-equal-to=\"#password\" required >");
        $("#userdiv").html("<input id=\"username\" name=\"userName\" type=\"text\" class=\"am-input-sm am-form-field\"  required>");
    }
    $("#id").val(id);
    $("#username").val(username);
    $("#tel").val(tel);

    $("#doc-modal-1").modal({
        //width : 800,
        //height : 600,
        closeViaDimmer : 1,
        cancelable : false
    });
}

// 提交表单
function toSubmit() {
    $("#usermanage-form").submit();
}

function toDelete(id) {
    ids = id;
    $("#my-confirm").modal({
        relatedTarget : this,
        onConfirm : function(options) {
            $.ajax({
                url : "login/delete",
                dataType : "json",
                data : "id=" + ids,
                type : "POST",
                success : function(data) {
                    if (data.code == 0) {
                        userTable.ajax.reload(null, false);
                    } else {
                        alert("删除失败！")
                    }
                }
            });
        },
        onCancel : function() {
        }
    });
}
