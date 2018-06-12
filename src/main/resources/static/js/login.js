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
            for(var i=0;i<data.length;i++){
                $("#fieldset").append("<div class=\"div_question\" id=\"div\">\n" +
                    "                                    <div class=\"div_title_question_all\">\n" +
                    "                                        <div class=\"div_topic_question\">"+data[i].questionno+"</div>\n" +
                    "                                        <div id=\"divTitle3\" class=\"div_title_question\">"+data[i].question+"<span\n" +
                    "                                                class=\"req\">&nbsp;*</span></div>\n" +
                    "                                        <div style=\"clear:both;\"></div>\n" +
                    "                                    </div>\n" +
                    "                                    <div class=\"div_table_radio_question\" id=\"divquestion3\">\n" +
                    "                                        <div class=\"div_table_clear_top\"></div>\n" +
                    "                                        <ul class=\"ulradiocheck\">\n" +
                    "                                            <li style=\"width:99%;\"><a href=\"javascript:\" class=\"jqRadio jqChecked\"\n" +
                    "                                                                      rel=\"q3_1\"></a><input\n" +
                    "                                                    style=\"display:none;\" type=\"radio\" name=\"q3\" id=\"q3_1\"\n" +
                    "                                                    value=\"1\"><label for=\"q3_1\">"+data[i].answera+"</label></li>\n" +
                    "                                            <li style=\"width: 99%;\"><a href=\"javascript:\" class=\"jqRadio\"\n" +
                    "                                                                       rel=\"q3_2\"></a><input style=\"display:none;\"\n" +
                    "                                                                                             type=\"radio\" name=\"q3\"\n" +
                    "                                                                                             id=\"q3_2\" value=\"2\"><label\n" +
                    "                                                    for=\"q3_2\">"+data[i].answerb+"</label></li>\n" +
                    "                                            <li style=\"width:99%;\"><a href=\"javascript:\" class=\"jqRadio\" rel=\"q3_3\"></a><input\n" +
                    "                                                    style=\"display:none;\" type=\"radio\" name=\"q3\" id=\"q3_3\"\n" +
                    "                                                    value=\"3\"><label for=\"q3_3\">"+data[i].answerc+"</label></li>\n" +
                    "                                            <li style=\"width:99%;\"><a href=\"javascript:\" class=\"jqRadio\" rel=\"q3_4\"></a><input\n" +
                    "                                                    style=\"display:none;\" type=\"radio\" name=\"q3\" id=\"q3_4\"\n" +
                    "                                                    value=\"4\"><label for=\"q3_4\">"+data[i].answerd+"</label></li>\n" +
                    "                                            <div style=\"clear:both;\"></div>\n" +
                    "                                        </ul>\n" +
                    "                                        <div style=\"clear:both;\"></div>\n" +
                    "                                        <div class=\"div_table_clear_bottom\"></div>\n" +
                    "                                    </div>\n" +
                    "                                    <div class=\"errorMessage\"></div>\n" +
                    "                                </div>")
            }

        }
    });

});