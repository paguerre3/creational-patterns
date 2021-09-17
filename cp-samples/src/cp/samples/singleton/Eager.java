package cp.samples.singleton;

/**
 * INICIALIZACIÓN TEMPRANA (eager normal):
 * La la instancia del objeto se crea en el momento de carga de la clase (class loading).
 * Es la manera mas simple de creación aunque lo malo es que "va a existir independiententemente
 * de si algún cliente lo usa o no".
 */
public class Eager {
    private static volatile Eager instance = new Eager();

    // constructor privado
    private Eager() {
    }

    public static Eager getInstance() {
        return instance;
    }
}
