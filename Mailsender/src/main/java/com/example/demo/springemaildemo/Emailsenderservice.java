package com.example.demo.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class Emailsenderservice {
@Autowired
private JavaMailSender mailsender;

public void sendsimpleEmail(String toEmail,String subject,String body) {
	SimpleMailMessage message=new SimpleMailMessage();
	message.setFrom("dineshkumar12c4@gmail.com");
	message.setTo(toEmail);
	message.setText(body);
	message.setSubject(subject);
	
	mailsender.send(message);
	
	System.out.println("Mail Sent Successfully****");
}

}
