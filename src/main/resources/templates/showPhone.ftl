<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>华商晨报年会签到</title>
    <link href="/lfy/static/jtsc/new_css/default.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/lfy/static/js/jquery-2.0.3.min.js"></script>

    <script src="/lfy/static/jtsc/new_js/page.js"></script>
    <script type="text/javascript" src="/lfy/static/jtsc/jquery.blockUI.js"></script>
    <script type="text/javascript" src="/lfy/static/jtsc/common-client.js"></script>
    <style type="text/css">
        table.altrowstable {
            font-family: verdana, arial, sans-serif;
            font-size: 11px;
            color: #333333;
            border-width: 1px;
            border-color: #a9c6c9;
            border-collapse: collapse;
        }

        table.altrowstable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
        }

        table.altrowstable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
        }

        .oddrowcolor {
            background-color: #d4e3e5;
        }

        .evenrowcolor {
            background-color: #c3dde0;
        }
    </style>

</head>
<body>


<div class="bootstrap-table">
    <div class="fixed-table-toolbar">
        <label class="label_title">
            <h3>
                <div style="margin-left: 500px;margin-right: auto">华商晨报年会签到记录</div>

            </h3>
            <h5 style="margin-left: 800px;" id="pageCount"></h5>

        </label>
    </div>
    <div class="fixed-table-container" style="padding-bottom: 0px;">
        <div class="fixed-table-header" style="display: none;">
            <table></table>
        </div>
        <div class="fixed-table-body">
            <div class="fixed-table-loading" style="top: 41px; display: none;">正在努力地加载数据中，请稍候……</div>
            <table id="actTable" class="table table-hover table-striped altrowstable"  style="margin: 20px auto auto 100px; min-width: 800px  ">
                <thead>
                <tr>
                    <th>
                        姓名
                    </th>
                    <th>
                        手机号
                    </th>
                    <th>
                        行业
                    </th>


                </tr>
                </thead>
                <tbody id="dataContent">
                </tbody>
            </table>
        </div>
        <div class="fixed-table-footer" style="display: none;">
            <table>
                <tbody>
                <tr></tr>
                </tbody>
            </table>
        </div>
        <div class="fixed-table-pagination" style="display: block;">
            <div class="pull-left pagination-detail"><span
                    class="pagination-info" id="pageMsg"></span></div>
            <div class="pull-right pagination page_right">
                <div class="tcdPageCode">
                </div>
            </div>
        </div>
        <div style="clear: both"></div>
    </div>
</div>

<script type="text/javascript">
    $(function () {
        show();
//        setInterval(show, 3000);
    });

    function show() {
        $.ajax({
            type: "GET",
            dataType: "json",
            url: "/lfy/qd/getPhones",
            data: "",
            success: function (data) {
                console.info(data);
                $("#dataContent").html("")
                $("#pageCount").html("共" + data.count + "条记录")
                for (var i = 0; i < data.msg.length; i++) {
                    if (i % 2 == 0) {
                        $("#dataContent").append("<tr class='evenrowcolor'><td>" + data.msg[i].userName + "</td><td>" +
                                data.msg[i].phoneNO + "</td><td>" + data.msg[i].identity + "</td></tr>");
                    } else {
                        $("#dataContent").append("<tr class='oddrowcolor'><td>" + data.msg[i].userName + "</td><td>" +
                                data.msg[i].phoneNO + "</td><td>" + data.msg[i].identity + "</td></tr>");
                    }

                }


            }, error: function () {
                console.info("系统异常");
            }
        });
    }

</script>
</body>
</html>