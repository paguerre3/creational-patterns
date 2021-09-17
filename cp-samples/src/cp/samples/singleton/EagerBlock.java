package cp.samples.singleton;

/**
 * INICIALIZACIÓN TEMPRANA (eager con manejo de excepción):
 * La la instancia del objeto se crea en el momento de carga de la clase (class loading)
 * mediante un blóque estático de codigo que permite el manejo de excepción durante
 * la instanciación (diferencia con Eager común).
 * Es la segunda manera más simple de creación aunque lo malo es que "va a existir independiententemente
 * de si algún cliente lo usa o no".
 */
public class EagerBlock {

    private static EagerBlock instance;

    // inicialización en bloque estático de código (tipo eager)
    static {
        try {
            instance = new EagerBlock();
        } catch (Exception e) {
        }
    }

    // constructor privado
    private EagerBlock() {
    }

    public static EagerBlock getInstance() {
        return instance;
    }
}
