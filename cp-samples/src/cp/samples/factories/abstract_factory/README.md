# Abstract Factory (factory of factories)
Es una interfaz (o clase abstracta) para la creación de familias de objetos dependientes relacionados sin especificar sus clases concretas.
Este modelo permite la instanciación de objetos provenientes de diferentes familias mediante un "patrón o forma general" de construcción.

![factory-method-diagram](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/factories/abstract_factory/_abstract-factory-diagram.iuml)

¿Cuándo se usa?:
* En sistemas que consisten de multiples familias de objetos, las cuales estan diseñadas para ser usadas de manera conjunta.
* En casos donde la creación y composición de los objetos del sistema son independientes al cliente.
* Cuando el proceso de instanciación requiere de una variable en tiempo de ejecución.

---
**NOTA**

El patrón es excelente para la creación de objetos predefinidos pero agregar nuevos implica agregar cambios en la fábrica abstracta y las subclases.