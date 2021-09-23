package cp.samples.prototype;

/**
 * Prototype abstract class:
 * En este ejemplo se usa "copy" para evidenciar la necesidad
 * de implementar el metodo de la clase abstracta protorype
 * (en java existe el método clone que extiende de Object
 * el cual se suele sobre-escribir).
 */
public abstract class SimpleBook {
    private String title;
    protected String topic;
    private String mainAuthor;
    private int year;

    public abstract SimpleBook copy();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public String getMainAuthor() {
        return mainAuthor;
    }

    public void setMainAuthor(String mainAuthor) {
        this.mainAuthor = mainAuthor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "SimpleBook{" +
                "title='" + title + '\'' +
                ", topic='" + topic + '\'' +
                ", mainAuthor='" + mainAuthor + '\'' +
                ", year=" + year +
                '}';
    }
}
