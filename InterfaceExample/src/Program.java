public class Program {
    public static void main(String[] args) {


        Printable printable = new Book("Java cpomplete Reference", "h.Shildt");
        printable.print();
        printable = new Journal("Foreign Police");
        printable.print();
    }
}

interface Printable {
    void print();
}

class Book implements Printable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {

    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}