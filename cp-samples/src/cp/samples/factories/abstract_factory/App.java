package cp.samples.factories.abstract_factory;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        FactoryProvider.getFactory("Toy").ifPresent(t -> {
            Optional<Toy> toy = t.create("Dog");
            toy.ifPresent(d -> {
                System.out.println(d.getType());
                d.makeSound();
            });
        });
        FactoryProvider.getFactory("Color").ifPresent(t -> {
            Optional<Color> color = t.create("Pnk");
            color.ifPresent(c -> {
                System.out.println(c.getColor());
                System.out.println(c.getRgbCode());
            });
        });
        FactoryProvider.getFactory("NN").ifPresentOrElse(f -> {},
                () -> System.out.println("Factory not found!"));
    }
}
