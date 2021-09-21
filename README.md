# Patrones de Creación
Un patrón de diseño describe una solución establecida para los problemas más comunes en el diseño de software. 

Paradigma: POO

Los Patrones de Creación se preocupan por la forma en que se crean los objetos. Reducen la complejidad y la inestabilidad al crear objetos de manera controlada.

El operador "new" a menudo se considera dañino ya que dispersa objetos por toda la aplicación. Con el tiempo, cambiar una implementación puede resultar un desafío porque las clases se encuentran altamente acompladas al contexto del cliente.

Los patrones de creación abordan este problema al desvincular al cliente por completo del proceso de inicialización real.

1. [Singleton](https://github.com/paguerre3/creational-patterns/tree/main/cp-samples/src/cp/samples/singleton)
2. [Factory Method](https://github.com/paguerre3/creational-patterns/tree/main/cp-samples/src/cp/samples/factories/factory_method)
3. [Abstract Factory](https://github.com/paguerre3/creational-patterns/tree/main/cp-samples/src/cp/samples/factories/abstract_factory)

Audiencia: Desarrolladores, preferentemente Java o con bases de POO, que necesiten reveer los patrones fundamentales de creación y cuando usarlos.



---
Origen: Elements of Reusable Object-Oriented Software publicado en 1994 por Erich Gamma, John Vlissides, Ralph Johnson y Richard Helm (Gang of Four o GoF).

**NOTA**

Singleton mejorado (Bill Pugh).

Builder simplificado (Joshua Bloch).