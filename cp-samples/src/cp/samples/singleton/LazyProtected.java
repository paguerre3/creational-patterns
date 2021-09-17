package cp.samples.singleton;

/**
 * INICIALIZACIÓN TARDÍA (thread safe/bloqueante y acceso costoso):
 * La instancia se crea en el momento del llamado global (estático) al método getInstance
 * el cual es bloqueante (sección sincronizada/thread-safe), por lo cual,
 * solo un thread pueda ejecutar este método y es la manera más simple de protección (syncronizada)
 * aunque NO es lo óptimo en terminos de rendimiento,
 * i.e. si la instancia ya está creads los proximos threads sufrirían del "bloqueo/sincronización
 * mediante el acceso al método global"
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
