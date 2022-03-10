package lv.tsi.java;

public class CustomEcpetion extends Exception{
    String message;

    public CustomEcpetion(String message){
        super(message);
        this.message = message;
    }

}
