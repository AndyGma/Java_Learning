package Les1_HelloWorld;

public class HelloAndy {

    public static void main(String[] args) {
        HelloAndyLib.One();

        for (int i = 0; i < args.length; ++i) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
        System.out.println("End Lesson. Thanks");
    }
}
