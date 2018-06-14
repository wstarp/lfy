<div class="tpl-content-wrapper">
    <div class="container-fluid am-cf">
        <div class="row">
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                <div class="widget am-cf">
                    <div class="widget-head am-cf">
                        <div class="widget-title  am-cf">用户管理</div>
                    </div>
                    <div class="widget-body  am-fr">

                        <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                            <div class="am-form-group">
                                <div class="am-btn-toolbar">
                                    <div class="am-btn-group am-btn-group-xs">
                                        <button type="button" onclick="showEdit()"
                                                class="am-btn am-btn-default am-btn-success">
                                            <span class="am-icon-plus"></span> 新增
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="am-u-sm-12">
                            <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black "
                                   id="dataTables">
                                <thead>
                                <tr>
                                    <th >用户名</th>
                                    <th >用户密码</th>
                                    <th >电话</th>
                                    <th >用户类型</th>
                                    <th >操作</th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
	<!-- content end -->
    <!-- 删除窗口 -->
	<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm">
        <div class="am-modal-dialog">
            <div class="am-modal-bd">确定要删除选中的数据吗？</div>
            <div class="am-modal-footer">
                <span class="am-modal-btn" data-am-modal-cancel>取消</span> <span class="am-modal-btn" data-am-modal-confirm>确定</span>
            </div>
        </div>
    </div>
	<!-- 编辑窗口  modal start -->
	<div class="am-modal  am-modal-no-btn" tabindex="-1" id="doc-modal-1">
        <div class="am-modal-dialog ">
            <div class="am-modal-hd">
                <a href="javascript: void(0)" class="am-close" data-am-modal-close>&times;</a>
            </div>
            <div class="am-modal-bd">
                <div class="am-cf">
                    <div class="am-fl am-cf">
                        <strong class="am-text-primary am-text-lg">管理用户</strong> /
                        <small id="usertitle"></small>
                    </div>
                </div>
                <hr>
                <form class="am-form" id="usermanage-form" action="">
                    <div class="am-tabs am-margin" data-am-tabs>
                        <div class="am-tabs-bd" style="border: 1px solid #DDDDDD; font-size: 15px;">
                            <div class="am-tab-panel am-fade  am-in  am-active">
                                <div class="am-u-lg-7">
                                    <input id="id" name="id" type="hidden">
                                    <input name="loginType" value="normal" type="hidden">
                                    <div class="am-g am-margin-top">
                                        <div class="am-u-sm-4 am-u-md-4 am-text-right">用户名</div>
                                        <div id="userdiv" class="am-u-sm-8 am-u-md-6 "></div>
                                        <div class="am-text-left am-text-danger">*</div>
                                    </div>
                                    <div class="am-g am-margin-top">
                                        <div class="am-u-sm-4 am-u-md-4 am-text-right">联系电话</div>
                                        <div id="teldiv" class="am-u-sm-8 am-u-md-6 "></div>
                                        <div class="am-text-left am-text-danger">*</div>
                                    </div>
                                    <div class="am-g am-margin-top">
                                        <div class="am-u-sm-4 am-u-md-4 am-text-right">密码</div>
                                        <div id="pswdiv" class="am-u-sm-8 am-u-md-6 am-u-end"></div>
                                        <div class="am-text-left am-text-danger ryt-star">*</div>
                                    </div>
                                    <div class="am-g am-margin-top">
                                        <div class="am-u-sm-4 am-u-md-4 am-text-right">密码确认</div>
                                        <div id="repswdiv" class="am-u-sm-8 am-u-md-6 "></div>
                                        <div class="am-text-left am-text-danger ryt-star">*</div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <button type="button" onclick="toSubmit()" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
                        <button type="reset" class="am-btn am-btn-primary am-btn-xs" data-am-modal-close>放弃保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
<script src="static/js/user.js"></script>
