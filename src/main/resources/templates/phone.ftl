<!DOCTYPE HTML>
<html>
<head>
    <title>花开之季</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-cache" /><!--只是或者请求的消息不能缓存-->
    <meta name="viewport" content="width=device-width" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" /><!--强制让文档与设备的宽度保持 1:1 ；
    文档最大的宽度比列是1.0（ initial-scale 初始刻度值和 maximum-scale 最大刻度值）；user-scalable 定义用户是否可以手动缩放（ no 为不缩放），使页面固定设备上面的大小；-->
    <meta name="apple-mobile-web-app-capable" content="yes" /><!--网站开启对 web app 程序的支持-->
    <meta name="apple-mobile-web-app-status-bar-style" content="black" /><!--（改变顶部状态条的颜色）-->
    <link href="/lfy/static/css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/lfy/static/js/jquery.js"></script>
    <script type="text/javascript" src="/lfy/static/js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="/lfy/static/js/modernizr.custom.js"></script>
    <script type="text/javascript" src="/lfy/static/js/jquery.dlmenu.js"></script>
    <#--<script src="/lfy/static/js/jquery.min.js"></script>-->
    <script src='/lfy/static/js/hhSwipe.js' type="text/javascript"></script>
</head>
<body>


<div class="wrap_box">

    <img class="bg" src="/lfy/static/images/qd.png"/>

    <div class="tou">
        <b>花开之季</b>
        华商晨报年会签到
    </div>
    <!---内容开始-->
    <ul class="ly_box">
        <div class="ly_text">
            <p>姓名：</p>
            <p>手机：</p>
            <p>行业：</p>


        </div>
        <div class="ly_input">
            <input type="text" id="userName" placeholder="姓名" maxlength="15" name="userName" autofocus="autofocus">
            <input type="text" id="phoneNO" placeholder="手机号" maxlength="13" name="phoneNO" >
            <input type="text" id="identity" placeholder="行业" maxlength="20" name="identity" >

        </div>
    </ul>
    <!--内容结束-->

    <input class="bu" onclick="toSubmit()"  type="button" value="下一步"/>


</div>
<script type="text/javascript">
    $(function() {
        //获取所有归口部门


    });

    function toSubmit() {
        var userName = $("#userName").val();
        var identity = $("#identity").val();
        if(! userName){
            alert("请填写姓名");
            return;
        }
        var phoneNO =  $("#phoneNO").val();
        if (!phoneNO) {
            alert("请填写手机号");
            return;
        }
        else if (phoneNO.length != 11) {
            alert("请填写正确的手机号");
            return;
        }
        else {
            var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(16[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
            if (!myreg.test(phoneNO)) {
                alert("请填写正确的手机号!");
                return;
            }
        }

        if(! identity){
            alert("请输入行业");
            return;
        }
        var saveValue = $("#forme").serialize();
        console.log(saveValue.userName)
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/lfy/qd/doPhone" ,
            data: {
                identity:identity,
                userName :userName,
                phoneNO:phoneNO
            },
            success: function (data) {
                console.debug(data);
                if(data.code=="0"){
                    console.info("提交成功");
                    window.location.href="/lfy/qd/dati"
                }else  if(data.code=="1"){
                    alert("手机号不能重复");
//                    window.location.href="/lfy/user/toLogin"
                }
            },error:function(){
                alert("系统异常");
            }
        });
    }

</script>
</body>
</html>





















