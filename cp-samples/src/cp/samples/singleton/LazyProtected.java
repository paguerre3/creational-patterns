package cp.samples.singleton;

/**
 * INICIALIZACIÓN TARDÍA (thread safe aunque protección costosa):
 * La instancia se crea en el momento del llamado Global (estático) al método getInstance
 * el cual está protegido (thread-safe) y es la manera más simple de protección (syncronizada)
 * aunque NO es lo óptimo en terminos de rendimiento en cuanto al momento de creación,
 * i.e. si la instancia ya está instanciada los proximos threads sufrirían del "checkeo por sincronización"
 * aunque solo un thread pueda ejecutar este método (protección costosa).
 */
public class LazyProtected {
    private static LazyProtected instance;

    // constructor privado
    private LazyProtected(){}

    public synchronized static LazyProtected getInstance(){
        if(instance == null){
            instance = new LazyProtected();
        }
        return instance;
    }
}
