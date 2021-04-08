package chapter6.modifiers;

public class SomeModifiers {
    private int alpha;          // private access
    public int beta;            // public access
    int gamma;                  // default access

    void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    int getAlpha() {
        return alpha;
    }
}
