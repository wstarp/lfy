package com.tech.lfy.controller;

import com.oracle.javafx.jmx.json.JSONException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestController {
    public static void main(String[] args) {

        // 发送 POST 请求
        String result = "";
        String hostName = "";
        hostName =  "http://127.0.0.1:8080/lfy/";
        /**
         * 1 注册
         */
        String url = "regist/doRegist";
        Map<String,String> json = new HashMap<String,String>();
        try {
            json.put("userName", "guest2");
            json.put("pass", "123456");
            json.put("loginType","normal");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        clientPost(hostName +url,json);

        /**
         * 2 登录
         */
//        String url = "login/dologin";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("userName", "guest");
//            json.put("pass", "123456");
//            json.put("loginType","normal");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

        /**
         *  3校验手机是否注册过
         */
//        String url = "regist/verifyTelRegisted";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("tel", "15242442692");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

        /**
         * 4 英语单词查询
         */
//        String url = "EnglishWord/doEnglishWord";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("word", "A");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);


        /*5 英语课程分类单词查询*/
//        String url = "EnglishWord/doState";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("state", "0");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

         /*6 英语文章分类（课文+每日美文）*/
//        String url = "EnglishArticleController/doEnglishArticle";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("state", "1");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

          /*7 课程分类（阅读+听力））*/
//        String url = "EnglishClassController/doEnglishClass";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("state", "1");
//            json.put("classify", "2");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);


         /*8 下载中心*/
//        String url = "download/doDownload";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            //
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

          /*9 学习论坛显示列表*/
//        String url = "TalkController/doTalk";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            //
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);


          /*10 用户学习论坛增加页面*/
//        String url = "TalkController/doAdd";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("talkName","talkName12");
//            json.put("userName","userName22");
//            json.put("content","content32");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

        /*11 学习论坛显示列表*/
//        String url = "TalkController/doFind";
//        Map<String,String> json = new HashMap<String,String>();
//        try {
//            json.put("find","userName2");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        clientPost(hostName +url,json);

    }



    /**
     * 使用httpclient发送json数据
     * @param url
     * @return
     * 响应结果
     */
    public static String clientPost(String url,Map<String,String> map) {
        String send_returnm = null;
        try {
            HttpPost post = new HttpPost(url);
            CloseableHttpClient httpclient = HttpClients.createDefault();
            StringEntity entity = null;
            //装填参数
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if(map!=null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
            }
            post.setHeader("Content-type", "application/x-www-form-urlencoded");
            post.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            post.setEntity(new UrlEncodedFormEntity(nvps,  "utf-8"));

            //读取返回结果
            HttpResponse as = httpclient.execute(post);
            InputStream strmend = as.getEntity().getContent();
            InputStreamReader isrmend = new InputStreamReader(strmend, "utf-8");
            BufferedReader br1mend = new BufferedReader(isrmend);
            send_returnm = br1mend.readLine();
            System.out.println("post数据为："+map.toString());
			System.out.println("post结果数据为："+send_returnm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return send_returnm;
    }

    /**
     * 使用httpclient上传文件
     * @param url
     * @param filepath
     * @return
     * @throws ParseException
     * @throws IOException
     */
    public static String uploadRecourse(String url, String filepath) throws ParseException, IOException{

        File file = new File(filepath);
        String send_returnm = null ;
        HttpPost post = new HttpPost(url);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 文件
        FileBody fileBody = new FileBody(file);
        // 消息
        StringBody stringBody1 = new StringBody("Message 1", ContentType.MULTIPART_FORM_DATA);
        StringBody stringBody2 = new StringBody("Message 2", ContentType.MULTIPART_FORM_DATA);
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        builder.addPart("upfile", fileBody);
        builder.addPart("text1", stringBody1);
        builder.addPart("text2", stringBody2);
        HttpEntity entity = builder.build();
        post.setEntity(entity);
        try {
            HttpResponse as = httpclient.execute(post);
            InputStream strmend = as.getEntity().getContent();
            InputStreamReader isrmend = new InputStreamReader(strmend, "utf-8");
            BufferedReader br1mend = new BufferedReader(isrmend);
            send_returnm = br1mend.readLine();
//			System.out.println("post结果数据为："+send_returnm);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return send_returnm;
    }
}
