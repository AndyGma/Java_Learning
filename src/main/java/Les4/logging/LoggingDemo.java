package Les4.logging;

import java.util.logging.*;

public class LoggingDemo {

    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger("Les4.logging");
        logger.setLevel(Level.FINE);
        FileHandler fileHandler = new FileHandler("C:\\Users\\User\\Documents\\GitHub\\Java_Learning\\src\\main\\java\\Les4\\logging\\logging.txt");
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        new ClassA().doSomething();
        new ClassB().doSomethingElse();
    }
}
