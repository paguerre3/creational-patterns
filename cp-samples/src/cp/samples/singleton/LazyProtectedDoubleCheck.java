package cp.samples.singleton;

/**
 * INICIALIZACIÓN TARDÍA (thread safe/bloqueante aunque accesso mejorado):
 * La instancia se crea en el momento del llamado global (estático) al método getInstance
 * el cual está protegido dentro de una sección bloqueante (thread-safe/sincronizado)
 * y solo un thread pueda ejecutar este método.
 * En este caso se "mejora el rendimiemnto durante acceso al método global"
 * en el cual, si la instancia ya fué creada, y los siguientes threads no habían arribado
 * a la sección sinncronizada entonces el primer checkeo garantizará el acceso a
 * una instancia única sin tener que pasar por la sección bloqueante (primer check).
 * Notar que si varios threads acceden a la sección bloqueante existe un doble checkeo que,
 * a la larga, garantizará la creación de una instancia única (segundo check).
 */
public class LazyProtectedDoubleCheck {
    private static LazyProtectedDoubleCheck instance;

    // constructor privado
    private LazyProtectedDoubleCheck(){}

    public LazyProtectedDoubleCheck getInstance(){
        if (instance == null) {
            synchronized (LazyProtectedDoubleCheck.class) {
                if (instance == null) {
                    instance = new LazyProtectedDoubleCheck();
                }
            }
        }
        return instance;
    }
}
