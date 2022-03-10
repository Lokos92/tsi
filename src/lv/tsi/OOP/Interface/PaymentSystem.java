package lv.tsi.OOP.Interface;

public class PaymentSystem {
    void pay(Payable payableTicket){
        if(payableTicket.getPrice() < 0){

        }
        System.out.println("Charging amount: " + payableTicket.getPrice());
    }
}
