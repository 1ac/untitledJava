import static java.lang.System.out;

public class Program {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(
                () -> {
                    for (int i = 1; i <= 10000; i++) {
//                        out.printf("%s : %d\n", Thread.currentThread().getName(), i);
                        count++;
                    }
                }

        );

        Thread t1 = new Thread(
                () -> {
                    for (int i = 1; i <= 10000; i++) {
//                        out.printf("%s : %d\n", Thread.currentThread().getName(), i);
                        count++;
                    }
                }

        );

        t0.start();
        t1.start();

        t0.join();
        t1.join();

        out.println(count);

    }
}
