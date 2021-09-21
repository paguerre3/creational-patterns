package cp.samples.factories.abstract_factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class FactoryProvider {
    private static final Map<String, AbstractFactory<?>> factories = new HashMap<>(){
        {
            put("Toy", new ToyFactory());
        }
    };
    public static Optional<AbstractFactory> getFactory(final String choice) {
        return Optional.of(factories.get(choice));
    }
}
