public class Echo {
    public static void main(String args[]) {
        int i = 0;
        System.out.println(args);
        System.out.println(args.length);

        while(i < args.length) {
            System.out.println(args[i] + "");
            i++;
        }
    }
}
