package com.akanksha.Facade;

public class BookingFacade {

    public void createBooking(User user,TicketSystem ts){

        PaymentSystem ps=new PaymentSystem();
        NotificationSystem ns=new NotificationSystem();

        boolean isBookingPossible =ts.validateAvailablity("movie");
        if(isBookingPossible){
            ts.createTicket(100,user,"movie");
            ps.chargeCard();
            ns.sendEmail(user,ts.getTicketNumber());
            ns.sendSms(user,ts.getTicketNumber());
        }
    }
}
