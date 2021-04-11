package chapter7.shapes;

public class ColourTriangle extends Triangle {
    private String colour = null;

    protected ColourTriangle(String colour, double height, double width) {
        super(height, width);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void displayColour(){
        System.out.printf("Triangle is: %s%n", colour);
    }
}
