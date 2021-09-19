# Singleton
Su intención es garantizar que sólo "una instancia" de la clase exista por lo cual debe existir un único punto de acceso global (la llamadas subsiguientes retornan la misma instancia).

![singleton-diagram](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/singleton/_singleton-diagram.iuml)

¿Cuándo se usa?:
* Configuraciones base: Clases de aceso a configuraciones que, preferiblemente, no se actualizaran en tiempo de ejecución. 
* Recursos "caros de crear" en términos de rendimiento, e.g. establecimiento de conexión a la base de datos.
* Recursos compartidos y o/utilidades: Clases de acceso a recursos y/o procesos comunes entre multiples objetos de la aplicación.

