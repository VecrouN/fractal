package fractal;

public class IntPoint {
    public final int x;
    public final int y;

    public IntPoint() {
        x = 0;
        y = 0;
    }

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
