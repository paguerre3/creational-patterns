package cp.samples.singleton;

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

    // constructor privado
    private OnDemand() {}

    // clase de acceso global interna
    private static class InnerHelper {
        private static final OnDemand INSTANCE = new OnDemand();
    }

    public static OnDemand getInstance(){
        return InnerHelper.INSTANCE;
    }
}
