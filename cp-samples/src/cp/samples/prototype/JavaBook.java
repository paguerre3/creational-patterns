package cp.samples.prototype;

public class JavaBook extends SimpleBook {

    public JavaBook() {
        this.topic = "Java";
    }

    @Override
    public SimpleBook copy() {
        JavaBook javaBook = new JavaBook();
        javaBook.setTitle(this.getTitle());
        javaBook.setYear(this.getYear());
        javaBook.setMainAuthor(this.getMainAuthor());
        return javaBook;
    }
}
