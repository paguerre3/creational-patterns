package cp.samples.builder;

public class App {
    public static void main(String[] args) {
        Person p = Person.Builder.create("Camila")
                .withLastName("Aguerre")
                .withEmail("cami@gmail.com")
                .build();
        System.out.println(p);
        p = Person.Builder.create("Pablo")
                .withAddress("Mza 214 Lote 8")
                .withEmail("pablo.aguerre@gmail.com")
                .build();
        System.out.println(p);
    }
}
