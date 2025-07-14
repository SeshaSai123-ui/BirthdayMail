package com.example.BirthdayMailSending_Project.scheduler;

import com.example.BirthdayMailSending_Project.mail.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BirthdayScheduler
{
    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 21 14 7 *")
    public void sendBirthdayEmail()
    {
        String to="jaswanth.nalam7340@gmail.com";
        String subject="Belated birthday wishes";
        String body="Hi Bashini," +
                "\n"+"This is the email for your belated birthday wishes from your shreya singh tagore" +
                ".She mentioned that you are the one for her dont leave her at any sitution" +
                "\n yours fiance Shreya";
        emailService.sendEmailOnBirthday(to,subject,body);
    }

}
