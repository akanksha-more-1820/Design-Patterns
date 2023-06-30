package com.akanksha.Facade;

public class NotificationSystem {

    public void sendEmail(User user, int i){
        System.out.println("sending email to "+ user.getEmailAddress());
    }

    public void sendSms(User user, int ticketNumber) {
        System.out.println("sending sms to "+ user.getPhoneNo());
    }
}
