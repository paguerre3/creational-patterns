package cp.samples.prototype;

public class App {
    public static void main(String[] args) {
        SimpleBook book = new JavaBook();
        book.setTitle("OOP and Java");
        book.setMainAuthor("Dany Poo");
        book.setYear(2013);
        System.out.println(book);
        SimpleBook anotherBook = book.copy();
        anotherBook.setYear(2021);
        System.out.println(anotherBook);
    }
}
