# Prototype
Delega el proceso de clonación (o copia) a los mismos objetos que están siendo clonados.
Este patrón declara una interfaz (o clase abstracta) para los objetos que serán clonados lo que implicará que se pueden clonar objetos desde la interfaz sin acoplar el código a las clases concretas.

![singleton-diagram](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/prototype/_prototype-diagram.iuml)

¿Cuándo se usa?:
* Cuando la creación de un objeto nuevo varía levemente sobre el que ya existía (posee un estado similar).

---
**NOTA**
La implementación de la copia puede ser "deep" (copia lenta ya que incluye la jerarquía de elementos contenidos de manera recursiva) o "shallow" (copia rápida incluyendo solo el primer nivel).