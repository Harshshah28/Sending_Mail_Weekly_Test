package com.geekster.Sending_mail_weekly_test.Controller;


import com.geekster.Sending_mail_weekly_test.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
    @Autowired
    Bike bike;
    @GetMapping("/bike")
    public String GetBike(){
        return bike.GetString();
    }
}