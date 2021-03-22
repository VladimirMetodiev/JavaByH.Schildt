package chapter4.logarithms;

import java.text.DecimalFormat;

public class Logarithm {
    double base = 0d;
    double logNumber = 0d;

    DecimalFormat df = new DecimalFormat("0.######");

    public Logarithm(double base, double logNumber) {
        this.base = base;
        this.logNumber = logNumber;
    }

    double customLog() {
        if (base == 0){ return 0; }
        else if(base == 1) { return 1; }
        return Math.log(logNumber) / Math.log(base);
    }

    void calculate() {
        if (base == 0) System.out.println("The base must be greater than 0.");
        else if(base == 1 & logNumber != 1) System.out.println("Error!");
        else System.out.println("The logarithm whit base " + df.format(base)  + " of " + df.format(logNumber) + " is: " + df.format(customLog()));
    }
}
