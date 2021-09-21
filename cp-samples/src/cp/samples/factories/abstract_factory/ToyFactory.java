package cp.samples.factories.abstract_factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ToyFactory extends AbstractFactory<Optional<Toy>> {
    private final Map<String, Toy> toys = new HashMap<>();

    @Override
    public Optional<Toy> create(String type) {
        // esta sección evita el uso de "switch" statements
        // y emula una especie de cache a nivel de instancia:
        if(toys.isEmpty()) {
            toys.put("Dog", new Dog());
            toys.put("Doll", new Doll());
        }
        return Optional.ofNullable(toys.get(type));
    }
}
