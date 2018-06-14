
function toAnswer() {
    $.ajax({
        type: "post",
        url : "EnglishTest/doEnglishTest",
        dataType:'json',
        data:  'selectType='+$("#selectType").val(),
        success: function(json){
            console.log(json.data)
            $("#answerList").html("");
            var data = json.data;
            if(!data){
                $("#answerList").html("无数据");
            }
            for(var i=0;i<data.length;i++){
                $("#answerList").append(
                    "<div style=\"width:99%;\" onclick=\"toChecked('"+data[i]+"')\">"+data[i]+"</div>"
                    )
            }
        }
    });
}
function toChecked(id) {
    window.location.href="englishTest?testid="+id;
}