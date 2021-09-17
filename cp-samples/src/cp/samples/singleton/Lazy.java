package cp.samples.singleton;

/**
 * INICIALIZACIÓN TARDÍA (single thread):
 * La instancia se crea en el momento del llamado Global (estático) al método getInstance
 * pero sólo sirve en un entorno "single-thread" ya que no está protegido, i.e.
 * si dos o mas threads entran al mismo tiempo a la cláusula "if" van a romper
 * el patrón ya que se basa en una instancia única.
 */
public class Lazy {
    private static Lazy instance;

    // constructor privado
    private Lazy(){}

    public static Lazy getInstance(){
        if(instance == null){
            instance = new Lazy();
        }
        return instance;
    }
}
