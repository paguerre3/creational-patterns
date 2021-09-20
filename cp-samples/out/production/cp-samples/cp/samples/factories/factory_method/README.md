# Factory Method
Es un método de creacion que traslada la responsabilidad de construción a la Fábrica/creador, evitando que sea el cliente quien hace "new", mediante la definición de una interfaz (o clase abstracta) para instanciar los objetos concretos.

![factory-method-diagram](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/paguerre3/creational-patterns/main/cp-samples/src/cp/samples/factories/factory_method/_factory-method-diagram.iuml)

¿Cuándo se usa?:
* Cuando el proceso de instanciación es relativamente simple y el constructor sólo requiere de "un puñado" de parámetros (o condiciones)
* Cuando la implementación de una interfaz o clase abstracta cambian con frequencia
* Cuando las implementaciones actuales no pueden adaptarse al cambio de manera adecuada (o se dificulta hacerlo)

