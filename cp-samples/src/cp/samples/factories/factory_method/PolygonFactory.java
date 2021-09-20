package cp.samples.factories.factory_method;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class PolygonFactory {
    private static Map<Integer, Polygon> polygons = new HashMap<>();

    public static Optional<Polygon> create(int numberOfSides){
        if (polygons.isEmpty()) {
            synchronized (PolygonFactory.class) {
                if (polygons.isEmpty()) {
                    polygons.put(3, new Triangle());
                    polygons.put(4, new Square());
                    // TODO: add more geometric figures here like Polygon, Pentagon and Heptagon
                }
            }
        }
        Optional<Polygon> p = Optional.ofNullable(polygons.get(numberOfSides));
        return p;
    }
}
