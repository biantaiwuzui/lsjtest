package edu.ezd.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * 互忆短信工具类
 * Created by JayJay on 2017/4/5.
 */
public class SMSUtils {
    private static String Url = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
    private static final Logger logger = Logger.getLogger(SMSUtils.class);


    public static void sendSMS(String phone){
       /* Sms sms = null;*/

        ResourceBundle resource = ResourceBundle.getBundle("sms");
        String sms_user = resource.getString("user");
        String sms_password = resource.getString("password");

        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("UTF-8");
        method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

        int mobile_code = (int)((Math.random()*9+1)*100000);
        logger.info(mobile_code);

        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

        NameValuePair[] data = {//提交短信
                new NameValuePair("account", sms_user), //查看用户名请登录用户中心->验证码、通知短信->帐户及签名设置->APIID
                new NameValuePair("password", sms_password),  //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
                //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile", phone),
                new NameValuePair("content", content),
        };
        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult =method.getResponseBodyAsString();

            //System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);

            if("2".equals(code)){
                logger.info("短信提交成功");
                /*sms = new Sms();
                sms.setPhone(phone);
                sms.setMoble_code(mobile_code);*/
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("短信提交失败");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("短信提交失败");
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("短信提交失败");
        }
       /* return sms;*/
    }

    public static void main(String [] args) {

        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(Url);

        client.getParams().setContentCharset("UTF-8");
        method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

        int mobile_code = (int)((Math.random()*9+1)*100000);
        logger.info(mobile_code);

        String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");

        NameValuePair[] data = {//提交短信
                new NameValuePair("account", "用户名"), //查看用户名请登录用户中心->验证码、通知短信->帐户及签名设置->APIID
                new NameValuePair("password", "密码"),  //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
                //new NameValuePair("password", util.StringUtil.MD5Encode("密码")),
                new NameValuePair("mobile", "手机号码"),
                new NameValuePair("content", content),
        };
        method.setRequestBody(data);

        try {
            client.executeMethod(method);

            String SubmitResult =method.getResponseBodyAsString();

            //System.out.println(SubmitResult);

            Document doc = DocumentHelper.parseText(SubmitResult);
            Element root = doc.getRootElement();

            String code = root.elementText("code");
            String msg = root.elementText("msg");
            String smsid = root.elementText("smsid");

            System.out.println(code);
            System.out.println(msg);
            System.out.println(smsid);

            if("2".equals(code)){
                System.out.println("短信提交成功");
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
