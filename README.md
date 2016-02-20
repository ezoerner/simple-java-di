Simple Java Dependency Injection
================================

Example of container-less Dependency Injection in Java 8 without external dependencies.
Inspired by MacWire for Scala.

####Links:

* [DI in Scala: guide, Dependency Injection in Scala using MacWire](http://di-in-scala.github.io/)


The basic idea is that the application context is encapsulated in a module, and customized versions of the modules can
be created for testing or other purposes by subclassing and overriding getters to provide test doubles or whatever is
needed for a particular instance of the module. A module can be passed into the constructor of a service object or
used to construct endpoints of other objects that require access to application context.

Modules can also be modeled using interfaces, abstract classes, and/or using composition.

The use of lazy initialization makes the initialization of the various components of the module order-independent,
though care is still necessary to avoid cycles.



##Run

    ./activator run

##Test

    ./activator test

