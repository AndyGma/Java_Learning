package Les2.sub;

import java.awt.*;

public abstract class Shape {

    private Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    protected Shape() {
        System.out.println("Shape constructor");
    }

    public final Color getColor() {
        return color;
    }

    public void draw() {
        System.out.println("shape");
    }
}
