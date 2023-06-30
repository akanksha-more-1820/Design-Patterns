package com.akanksha.Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> movies=new ArrayList<>();
        movies.add("movie");
        TicketSystem ts=new TicketSystem();
        ts.addMovies(movies);
        User user=new User("Akanksha","akanksha@gmail","12334");
        BookingFacade bookingFacade=new BookingFacade();
        bookingFacade.createBooking(user,ts);


    }
}
