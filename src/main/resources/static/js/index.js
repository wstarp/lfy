$(function() {
    addPanel('user')
});

/**打开一个新的tab页面
 * @param obj
 */
function addPanel(_url){

    if(_url.indexOf("_rand") > 0){
        _url = _url.replace(/_rand=\d+/,"_rand=" + Math.ceil(Math.random()*1000));
    }else{
        if(_url.indexOf("?") > 0 ){
            _url = _url + "&_rand=" + Math.ceil(Math.random()*1000);
        }else{
            _url = _url + "?_rand=" + Math.ceil(Math.random()*1000);
        }
    }

//	$("#iframe").attr("src",_url);
    $("#iframecontent").load(_url);

};

function showMenu(id) {
    $(".am-actives").removeClass("active");
    $("#"+id).addClass("active");
}
