package cp.samples.factories.abstract_factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ColorFactory extends AbstractFactory<Optional<Color>>{
    private static Map<String, Color> colors = new HashMap<>();

    @Override
    public Optional<Color> create(String colorAbbreviation) {
        // esta sección evita el uso de "switch" statements
        // y emula una especie de cache a nivel de instancia:
        if(colors.isEmpty()) {
            colors.put("Pnk", new Pink());
            colors.put("Wht", new White());
        }
        return Optional.ofNullable(colors.get(colorAbbreviation));
    }
}
