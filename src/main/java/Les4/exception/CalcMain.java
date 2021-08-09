package Les4.exception;

import javax.imageio.stream.ImageInputStreamImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcMain {

    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (; ; ) {
                System.out.println(">");
                String expr = reader.readLine();
                double result = new CalculatorImpl().calculate(expr);
                System.out.println(">>> " + result);
            }
        }
    }
}
