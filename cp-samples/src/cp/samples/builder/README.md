# Builder
Cuando la complejidad en la creación de objetos incrementa (e.g. atributos opcionales), este patrón separa el proceso de instanciación mediante el uso de otro objeto responsable de la construción, i.e. un constructor (builder).
Builder crea respresentaciones similares de instancias usando un enfoque "paso a paso".

![builder-simplified](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/builder/_builder-simplified-diagram.iuml)

¿Cuándo se usa?:
* Cuando existen muchas maneras de construir un objeto, usualmente debido a propiedades opcionales, se puede observar que el incremento en el número de propiedades tiene una relación directa con la cantidad de constructores nuevos (telescoping constructor anti-pattern).
* Cuando el cliente espera diferentes representaciones del objeto a construir.

---
**Nota**

¿Porqué no usar setters despues del "new""?

Usar setters después de crear un objeto implica que éste puede estar en estado inconsistente (a mitad de su construcción).
Además, no se cumple el principio de inmutabilidad de los Beans.
