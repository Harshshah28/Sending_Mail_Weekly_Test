package com.geekster.Sending_mail_weekly_test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomeConfig {
    @Bean
    public Student GetStudent(){
        System.out.println("object of type Student is Called From Bin");
        return new Student("Harsh_Shah");
    }

}