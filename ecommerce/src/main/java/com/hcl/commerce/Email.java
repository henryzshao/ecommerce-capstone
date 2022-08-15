package com.hcl.commerce;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class Email {
	
	public static void sendRegistrationMail(JavaMailSender javaMailSender, String email, String name) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);

		msg.setSubject("You've signed up for Capstone Commerce!");
		msg.setText("Welcome, "+name+".\n"
				+ " Thank you for signing up.");

		javaMailSender.send(msg);

	}
}
