package lv.tsi.OOP.Interface;

public class BookingSystem {
    void book(Bookable bookableTicket){
        System.out.println("Reserving seat for " + bookableTicket.getName());
    }
}
