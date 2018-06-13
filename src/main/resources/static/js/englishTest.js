var score = 0;
$(function() {// 初始化内容
    $.ajax({
        type: "post",
        url : "EnglishTest/doTestKey",
        dataType:'json',
        data:  'testkey=1',
        success: function(json){
            console.log(json.data)
            $("#fieldset").html();
            var data = json.data;
            $("#spanNotSubmit").html("每道题10分，共"+data.length*10+"分")
            for(var i=0;i<data.length;i++){
                $("#fieldset").append("<div class=\"div_question\" id=\"div\">" +
                    "                                    <div class=\"div_title_question_all\">" +
                    "                                        <div class=\"div_topic_question\">"+data[i].questionno+"</div>" +
                    "                                        <div id=\"divTitle3\" class=\"div_title_question\">"+data[i].question+"<span" +
                    "                                                class=\"req\">&nbsp;*</span></div>" +
                    "                                        <div style=\"clear:both;\"></div>" +
                    "                                    </div>" +
                    "                                    <div class=\"div_table_radio_question\" id=\"divquestion3\">" +
                    "                                        <div class=\"div_table_clear_top\"></div>" +
                    "                                        <ul class=\"ulradiocheck\">" +
                    "                                            <li style=\"width:99%;\" onclick=\"toChecked('"+data[i].id+"','"+data[i].answera+"','"+data[i].answertrue+"')\"><input" +
                    "                                                     type=\"radio\" name=\"q_"+data[i].id+"\" id=\"q_"+data[i].id+data[i].answera+"\"" +
                    "                                                    value=\"1\"><label for=\"q_"+data[i].id+data[i].answera+"\">"+data[i].answera+"</label></li>" +
                    "                                            <li style=\"width:99%;\" onclick=\"toChecked('"+data[i].id+"','"+data[i].answerb+"','"+data[i].answertrue+"')\"><input" +
                    "                                                    type=\"radio\" name=\"q_"+data[i].id+"\" id=\"q_"+data[i].id+data[i].answerb+"\"" +
                    "                                                    value=\"1\"><label for=\"q_"+data[i].id+data[i].answerb+"\">"+data[i].answerb+"</label></li>" +
                    "                                            <li style=\"width:99%;\" onclick=\"toChecked('"+data[i].id+"','"+data[i].answerc.replace("'","")+"','"+data[i].answertrue+"')\"><input" +
                    "                                                     type=\"radio\" name=\"q_"+data[i].id+"\" id=\"q_"+data[i].id+data[i].answerc+"\"" +
                    "                                                    value=\"1\"><label for=\"q_"+data[i].id+data[i].answerc+"\">"+data[i].answerc+"</label></li>" +
                    "                                            <li style=\"width:99%;\" onclick=\"toChecked('"+data[i].id+"','"+data[i].answerd+"','"+data[i].answertrue+"')\"><input" +
                    "                                                    type=\"radio\" name=\"q_"+data[i].id+"\" id=\"q_"+data[i].id+data[i].answerd+"\"" +
                    "                                                    value=\"1\"><label for=\"q_"+data[i].id+data[i].answerd+"\">"+data[i].answerd+"</label></li>" +
                    "                                            <div style=\"clear:both;\"></div>" +
                    "                                        </ul>" +
                    "                                        <div style=\"clear:both;\"></div>" +
                    "                                        <div class=\"div_table_clear_bottom\"></div>" +
                    "                                    </div>" +
                    "                                    <div class=\"divhide errorMessage "+data[i].id+"\">未作答</div>" +
                    "                                </div>")
            }
        }
    });
});

function toChecked(id,answera,answertrue) {
    if(answertrue == answera.substring(0,1)){
        $("."+id).html("正确");
        score+=10;

    }
    else {
        $("."+id).html("错误，正确答案是"+answertrue)
    }
}

function submitbutton() {
    $(".errorMessage").removeClass("divhide");
    $("#spanSubmit").html("您的得分"+score+"分");
    document.body.scrollTop = document.documentElement.scrollTop = 0;

}