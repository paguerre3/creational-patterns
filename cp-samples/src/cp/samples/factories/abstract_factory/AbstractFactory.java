package cp.samples.factories.abstract_factory;

import java.util.Optional;

public abstract class AbstractFactory <T> {
    public abstract <T> Optional<T> create(String condition);
}
