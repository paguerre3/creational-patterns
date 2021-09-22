package cp.samples.builder;

public class App {
    public static void main(String[] args) {
        Person p = Person.Builder.create("Camila")
                .withLastName("Ag")
                .withEmail("cami@gmail.com")
                .build();
        System.out.println(p);
        p = Person.Builder.create("Pablo")
                .withAddress("Somewhere")
                .withEmail("paul@gmail.com")
                .build();
        System.out.println(p);
    }
}
