# Singleton
Su intención es garantizar que sólo "una instancia" de la clase exista por lo cual debe existir un único punto de acceso global (la llamadas subsiguientes retornan la misma instancia).

![singleton-diagram](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/singleton/_singleton-diagram.iuml)

¿Cuándo se usa?:
* Configuraciones base: Clases de aceso a configuraciones que, preferiblemente, no se actualizaran en tiempo de ejecución. 
* Recursos "caros de crear" en términos de rendimiento, e.g. establecimiento de conexión a la base de datos.
* Recursos compartidos: Clases de acceso a recursos comunes entre multiples objetos de la aplicación.

Pseudocódigo:
<pre><code>
// Instanciación tardía "thread-safe" con doble checkeo:
class Config is
    private static field instance: Config
    
    // constructor privado para proteger instanciación externa.
    private constructor Config() is
        // Algún código de inicialización, 
        // e.g. se levanta un archivo de configuración con sus propiedades

    // El método global que controla el acceso a la instancia única.
    public static method getInstance() is
        if (Config.instance == null) then
            acquireThreadLock() and then
                if (Config.instance == null) then
                    Config.instance = new Config()
        return Config.instance

    // Lógica.
    public method getProperty(key) is

class Application is
    method main() is
        Database cfg = Config.getInstance()
        cfg.getProperty("key")
</code></pre>
