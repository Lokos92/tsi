package lv.tsi.OOP.Interface;

public class PaymentSystem {
    void pay(Payable payableTicket){
        System.out.println("Charging amount: " + payableTicket.getPrice());
    }
}
