package com.mail.test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {

	public static boolean sendMail(String to, String code) {  

        try {  
            Properties props = new Properties();  
            String from = "jiapengcheng_java@163.com";
            props.put("username", "jiapengcheng_java@163.com");   
            props.put("password", "jia19891001");   
//            props.put("username", "jackch2@wicresoft.com");   
//            props.put("password", "jia@19891001");
            props.put("mail.transport.protocol", "smtp" );  
            props.put("mail.smtp.host", "smtp.163.com");
//            props.put("mail.smtp.host", "smtp.mail.wicresoft.com"); 
            props.put("mail.smtp.port", "25" );  

            Session mailSession = Session.getDefaultInstance(props);  

            Message msg = new MimeMessage(mailSession);     
            msg.setFrom(new InternetAddress(from)); //发送者 
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to)); //接收邮件 
            msg.setSubject("邮件发送测试");   
            msg.setContent("<h1>You are SB!!!</h1>","text/html;charset=UTF-8");

            msg.saveChanges();  

            Transport transport = mailSession.getTransport("smtp");  
            transport.connect(props.getProperty("mail.smtp.host"), props  
                    .getProperty("username"), props.getProperty("password"));   
            transport.sendMessage(msg, msg.getAllRecipients());  
            transport.close();     
        } catch (Exception e) {  
            e.printStackTrace();  
            System.out.println(e);  
            return false;  
        }  
        return true;  
    }   
    public static void main(String[] args) {
        sendMail("fqbtbst@163.com", "89");
    }
}
