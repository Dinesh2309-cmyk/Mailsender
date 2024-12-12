package com.example.demo.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringEmailDemoApplication {
	@Autowired
	private Emailsenderservice sendservice;
	
	public static void main (String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()throws MessagingException{
	sendservice.sendsimpleEmail("dhilipkumar01411@gmail.com","This Is Dinesh","Hey bro, how are you doing");
	
	}

}
