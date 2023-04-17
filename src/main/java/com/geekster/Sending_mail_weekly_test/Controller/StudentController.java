package com.geekster.Sending_mail_weekly_test.Controller;

import com.geekster.Sending_mail_weekly_test.MailSend.HandleMail;
import com.geekster.Sending_mail_weekly_test.MailSend.MailConstants;
import com.geekster.Sending_mail_weekly_test.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Student student;
    @GetMapping("/student")
    public String GetStudent(){
        MailConstants Gmail = new MailConstants();
        Gmail.SENDER="imharshshah2828@gmail.com";
        Gmail.RECEIVER ="rockstar280707@gmail.com";
        Gmail.MESSAGE = student.toString();
        HandleMail mailer = new HandleMail();
        mailer.sendMail();
        return student.toString();
    }
}