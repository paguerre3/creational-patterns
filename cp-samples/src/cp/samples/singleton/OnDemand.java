package cp.samples.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * INSTANCIACIÓN TARDíA (a demanda vía inner static class):
 * Autor: Bill Pugh
 * En esta solución se utiliza una clase adicional "interna estática" la cual contiene
 * la creación de instancia única (singleton).
 * La clase "inner static" no se carga en la memoria y solo lo hace cuando se llama
 * al método getInstance, en ese momento, esta clase interna se carga
 * y crea la instancia de la clase singleton contenida (a demanda) lo cual no requiere el uso de bloqueos
 * durante la instanciación.
 */
public class OnDemand {

    Map<String, String> configs = new HashMap();

    // constructor privado
    private OnDemand() {
        long start = System.currentTimeMillis();
        //Se emula la carga del recurso costoso"
        try {
            TimeUnit.SECONDS.sleep(2);
            configs.put("key1", "val1");
            configs.put("key2", "val2");
        } catch (InterruptedException e) {
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("Elapsed time of init: " + String.valueOf(end - start));
        }
    }

    // clase de acceso global interna
    private static class InnerHelper {
        private static final OnDemand INSTANCE = new OnDemand();
    }

    public static OnDemand getInstance(){
        return InnerHelper.INSTANCE;
    }

    public Optional<String> getConfig(String key) {
        return Optional.ofNullable(configs.get(key));
    }
}
