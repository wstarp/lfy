<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>英语学习网站</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="icon" type="image/png" href="static/amazeui/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="static/amazeui/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <script src="static/amazeui/js/echarts.min.js"></script>
    <link rel="stylesheet" href="static/amazeui/css/amazeui.min.css"/>
    <link rel="stylesheet" href="static/amazeui/css/amazeui.datatables.min.css"/>
    <link rel="stylesheet" href="static/amazeui/css/app.css">
    <script src="static/amazeui/js/jquery.min.js"></script>

</head>

<body data-type="index">
<script src="static/amazeui/js/theme.js"></script>
<div class="am-g tpl-g">
    <!-- 头部 -->
    <header>
        <!-- logo -->
        <div class="am-fl tpl-header-logo">
            <a href="javascript:;"><img src="static/amazeui/img/logo.png" alt=""></a>
        </div>
        <!-- 右侧内容 -->
        <div class="tpl-header-fluid">
            <!-- 侧边切换 -->
            <div class="am-fl tpl-header-switch-button am-icon-list">
                    <span>

                </span>
            </div>

            <!-- 其它功能-->
            <div class="am-fr tpl-header-navbar">
                <ul>
                    <!-- 欢迎语 -->
                    <li class="am-text-sm tpl-header-navbar-welcome">
                        <a href="javascript:;">欢迎你, <span>Amaze UI</span> </a>
                    </li>
                    <!-- 退出 -->
                    <li class="am-text-sm">
                        <a href="javascript:;">
                            <span class="am-icon-sign-out"></span> 退出
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </header>
    <!-- 侧边导航栏 -->
    <div class="left-sidebar">
        <!-- 用户信息 -->
        <div class="tpl-sidebar-user-panel">
            <div class="tpl-user-panel-slide-toggleable">
                <div class="tpl-user-panel-profile-picture">
                    <img src="static/amazeui/img/user04.png" alt="">
                </div>
                <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              小张
          </span>
            <#--<a href="javascript:;" class="tpl-user-panel-action-link"> <span class="am-icon-pencil"></span> 账号设置</a>-->
            </div>
        </div>

        <!-- 菜单 -->
        <ul class="sidebar-nav">
        <#--<li class="sidebar-nav-heading">Components <span class="sidebar-nav-heading-info"> 附加组件</span></li>-->
            <li class="sidebar-nav-link">
                <a href="javaScript:addPanel('user');" class="am-actives active" onclick="showMenu('1')" id="1">
                    <i class="am-icon-home sidebar-nav-link-logo"></i> 用户管理
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="javaScript:addPanel('user');"  class="am-actives" onclick="showMenu('2')" id="2">
                    <i class="am-icon-table sidebar-nav-link-logo"></i> 菜单
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="javaScript:addPanel('user');"  class="am-actives" onclick="showMenu('3')" id="3">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 菜单
                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="javaScript:addPanel('user');" class="am-actives"  onclick="showMenu('4')" id="4">
                    <i class="am-icon-wpforms sidebar-nav-link-logo"></i> 菜单

                </a>
            </li>
            <li class="sidebar-nav-link">
                <a href="javaScript:addPanel('user');" class="am-actives" onclick="showMenu('5')" id="5">
                    <i class="am-icon-bar-chart sidebar-nav-link-logo"></i> 图表
                </a>
            </li>
        </ul>
    </div>


    <!-- 内容区域 -->
    <div id="iframecontent"></div>
</div>
</div>
<script src="static/amazeui/js/amazeui.min.js"></script>
<script src="static/amazeui/js/amazeui.datatables.min.js"></script>
<script src="static/amazeui/js/dataTables.responsive.min.js"></script>
<script src="static/js/index.js"></script>
</body>

</html>