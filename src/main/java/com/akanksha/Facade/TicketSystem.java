package com.akanksha.Facade;

import java.util.ArrayList;
import java.util.List;

public class TicketSystem {

    List<String> movies=new ArrayList<>();

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    private int ticketNumber;
    public boolean validateAvailablity(String movie) {
        if(this.movies.contains(movie)){
            return true;
        }
        return false;
    }

    public void addMovies(List<String> addMovies){
        this.movies.addAll(addMovies);
    }

    public void createTicket(int i, User user, String movie) {
        System.out.println("creating ticket for "+ user + "for movie "+movie+ "ticket no is"+i);
    }
}
