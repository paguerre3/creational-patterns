package cp.samples.factories.abstract_factory;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        FactoryProvider.getFactory("Toy").ifPresent(t -> {
            Optional<Toy> toy = t.create("Dog");
            toy.ifPresent(d -> {
                d.makeSound();
            });
        });
    }
}
