package Les2.sub;

import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        this(Color.BLACK);
    }

    public Circle(Color color) {
        super(color);
    }

    @Override // метод который переопределяет базовый метод
    public void draw() {
        super.draw();
        System.out.println("circle");
    }
}
