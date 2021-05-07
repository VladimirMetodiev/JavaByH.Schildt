package chapter12.ticketPrice;

public class ScreeningPrice {
    public static void main(String[] args){
        for(ScreeningTime time : ScreeningTime.values()){
            System.out.printf("The %s price is %.1f.%n", time, time.getPrice());
        }
    }
}
