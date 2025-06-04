public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World!");
            try {
                Thread.sleep(2000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }

        }

    }
}