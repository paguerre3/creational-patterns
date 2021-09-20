package cp.samples.factories.factory_method;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Polygon> op = PolygonFactory.create(3);
        op.ifPresent(p -> p.showDefinition());
        op = PolygonFactory.create(4);
        op.ifPresent(p -> p.showDefinition());
        op = PolygonFactory.create(5);
        op.ifPresentOrElse(p -> p.showDefinition(),
                () -> System.out.println("Geometric figure not found!") );
    }
}
