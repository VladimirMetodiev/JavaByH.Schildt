package chapter12.ticketPrice;

enum ScreeningTime {
    MORNING(9.5), AFTERNOON(12.5), EVENING(15.5);

    private double price;

    ScreeningTime(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
