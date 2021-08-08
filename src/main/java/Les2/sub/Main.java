package Les2.sub;

public class Main {

    public static void main(String[] args) {
        Shape s = new Circle();

        if (s instanceof Circle) {
            System.out.println("Circle");
        }
    }
}
