package Les2.sub;

import java.awt.*;

public abstract class Shape {

    private Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void draw() {
        System.out.println("shape");
    }
}
