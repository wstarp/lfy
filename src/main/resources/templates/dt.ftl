<!DOCTYPE HTML>
<html>
<head>
    <title>问卷</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-cache" /><!--只是或者请求的消息不能缓存-->
    <meta name="viewport" content="width=device-width" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" /><!--强制让文档与设备的宽度保持 1:1 ；
    文档最大的宽度比列是1.0（ initial-scale 初始刻度值和 maximum-scale 最大刻度值）；user-scalable 定义用户是否可以手动缩放（ no 为不缩放），使页面固定设备上面的大小；-->
    <meta name="apple-mobile-web-app-capable" content="yes" /><!--网站开启对 web app 程序的支持-->
    <meta name="apple-mobile-web-app-status-bar-style" content="black" /><!--（改变顶部状态条的颜色）-->
    <link href="/lfy/static/css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/lfy/static/js/jquery.js"></script>
    <script type="text/javascript" src="/lfy/static/js/modernizr.custom.js"></script>
    <script type="text/javascript" src="/lfy/static/js/jquery.dlmenu.js"></script>
    <#--<script src="/lfy/static/js/jquery.min.js"></script>-->
    <script src='/lfy/static/js/hhSwipe.js' type="text/javascript"></script>
</head>
<body>
<div class="wrap_box">
    <img class="bg" src="/lfy/static/images/dt.png"/>
    <img class="bd" src="/lfy/static/images/hh.png"/>
    <img class="ba" src="/lfy/static/images/hj.png"/>
    <!---内容开始-->
    <ul class="news_box">
        <li class="tu">
            尊贵的华商晨报合作伙伴:
        </li>
        <li class="news_show">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;花开之季，与您相约！请尊贵的您就如下社会高端人士的热点需求与我们互动一下吧：
        </li>
        <li class="news_show">
            1.您在国外、国内出行时，是否希望享受机场贵宾服务？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="aa" value="yes" />是
                <input class="chk" type="radio" name="aa" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            2.您及家人是否希望免费享受三级甲等医院专家预约及每年体检权益？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="bb" value="yes" />是
                <input class="chk" type="radio" name="bb" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            3.您是否希望拥有建行集团专属理财顾问，享受私人定制理财服务？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="cc" value="yes" />是
                <input class="chk" type="radio" name="cc" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            4.您是否了解在新的房产税法和婚姻法下，如何保全资产，规避风险？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="dd" value="yes" />是
                <input class="chk" type="radio" name="dd" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            5.您是否希望家族财富世代传承，甚至跨境传承，实现“富过三代”？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="ee" value="yes" />是
                <input class="chk" type="radio" name="ee" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            6.您是否希望在金税三期新政背景下做到合理避税？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="ff" value="yes" />是
                <input class="chk" type="radio" name="ff" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            7. 作为企业高级管理者，您是否已做到家企资产隔离，为家庭财富铸造一道防火墙，在企业
            遭遇危机时，可以最大限度地保护家庭财产？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="gg" value="yes" />是
                <input class="chk" type="radio" name="gg" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            8.在离婚率高起的现状下，您是否知晓下一代的婚姻财富如何规划才能减少财富外流？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="hh" value="yes" />是
                <input class="chk" type="radio" name="hh" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            9.您是否知晓家庭企业如何增配现金流？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="jj" value="yes" />是
                <input class="chk" type="radio" name="jj" value="no" /> 否
            </form>
        </li>
        <li class="news_show">
            10.您及家人是否希望参加建行品质生活、运动娱乐、子女教育等丰富多彩的高端客户专享活动？
        </li>
        <li class="news_show">
            <form >
                <input class="chk" type="radio" name="kk" value="yes" />是
                <input class="chk" type="radio" name="kk" value="no" /> 否
            </form>
        </li>

    </ul>

    <img id="tt" src="/lfy/static/images/cg.jpg"/>
    <input class="but" type="button"  value="提交" onclick="toSubmit();document.getElementById('tt').style='display:block'"/>
</div>
</body>
<script type="text/javascript">
    $(function() {
        //获取所有归口部门


    });

    function toSubmit() {
        setTimeout(window.close(),5000);
    }

</script>
</html>





















