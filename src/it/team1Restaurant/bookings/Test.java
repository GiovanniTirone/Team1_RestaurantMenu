package it.team1Restaurant.bookings;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        CalendarBookings calendarBookings = CalendarBookings.getInstance();
        //calendarBookings.createBookingsIntervalFromTwoDates(LocalDate.now(),LocalDate.of(2022,11,20));
        calendarBookings.createBookingsIntervalFromStartDate(LocalDate.now(),30);
        calendarBookings.printDetails();
    }

}