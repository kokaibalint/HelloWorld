public class HelloWorldApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello " + args[i] + "!");
            }

        } else {
            System.out.println("Hello World");
        }
    }
}