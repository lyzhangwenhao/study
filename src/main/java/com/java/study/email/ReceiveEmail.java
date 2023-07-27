package com.java.study.email;

import javax.mail.*;
import java.util.Properties;

/**
 * @author zhangwenhao
 * @date 2023-05-23 16:26
 */
public class ReceiveEmail {
    public static void main(String[] args) {
        // 邮箱地址和密码，密码使用授权码
        String user = "1277420858@qq.com";
        String password = "omgqyrpvldjjffji";

        // 邮件服务器地址和端口
        String imapHost = "imap.qq.com";
        int imapPort = 993;

        try {
            // 创建一个邮件会话
            Properties props = new Properties();
            props.setProperty("mail.store.protocol", "pop3");
            props.setProperty("mail.imap.host", imapHost);
            props.setProperty("mail.imap.port", String.valueOf(imapPort));
            props.setProperty("mail.imap.ssl.enable", "true");
            Session session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, password);
                }
            });

            // 打开一个邮件存储
            Store store = session.getStore("imap");
            store.connect();

            // 获取收件箱
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // 打印收件箱中的邮件数量
            System.out.println("Total Messages: " + inbox.getMessageCount());

            // 打印每一封邮件的主题和发送者
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                String contentType = message.getContentType();
                System.out.println(contentType);
                long l1 = System.currentTimeMillis();
                Object content = message.getContent();
                long l2 = System.currentTimeMillis();
                System.out.println("获取内容耗时：" + (l2 - l1) + "ms");
            }

            // 关闭收件箱和存储
            inbox.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
