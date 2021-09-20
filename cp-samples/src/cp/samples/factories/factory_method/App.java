package cp.samples.factories.factory_method;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        PolygonFactory.create(3).ifPresent(p -> p.showDefinition());
        PolygonFactory.create(4).ifPresent(p -> p.showDefinition());
        PolygonFactory.create(5).ifPresentOrElse(p -> p.showDefinition(),
                () -> System.out.println("Geometric figure not found!") );
    }
}
