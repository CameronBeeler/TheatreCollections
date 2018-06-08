package com.designpatterns.cambeeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        String seatStringArray = "A02 A12 B07 B11 C05 C06 C07 C08 D05 D06 E04 E05 E06 E07 B11";
        String[]  data = seatStringArray.split(" ");

        for (String s : data){
            if(theatre.reserveSeat(s)){
                System.out.println("Please pay for seat# " + s);
            } else {
                System.out.println("Seat " + s + " already reserved");
            }

        }

        List<Theatre.Seat> seats = new ArrayList<>(theatre.getSeats());
        printList(seats);
        printReservedList(seats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("G06", 15.00));
        priceSeats.add(theatre.new Seat("G07", 15.00));
        printList(seats);
        Collections.sort(priceSeats);
        Collections.sort(priceSeats, theatre.PRICE_ORDER);
        printList(priceSeats);


//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
    }


    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }

    public static void printReservedList(List<Theatre.Seat> list) {
        System.out.println("Reserved Seats List:");
        for(Theatre.Seat seat : list) {
            if(seat.isReserved()){
                System.out.print(" " + seat.getSeatNumber() + ",");
            }
        }
        System.out.println();
        System.out.println("======================================================================");
    }


}
