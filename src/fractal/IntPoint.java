package fractal;

import java.awt.Color;

public class IntPoint {
    public final int x;
    public final int y;
    Color color;
    public IntPoint() {
        x = 0;
        y = 0;
        color = new Color(0,0,0);
    }

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
        color = new Color(0,0,0);
    }
    public IntPoint(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
