Factory : A component responsible solely for wholesale (not piecewise like builder) creation of objects

- A factory method is a static method that creates objects
- A factory can take care of object creation
- A factory can be external or reside inside of object as an inner class
- Hierarchies of factories can be used to create related objects

AbstractBaseFactory
    - We can create a interface and group different implementations of related Factories.
    - With AbstractBaseFactory implementation users can list-find different implementation of a Factory with using Reflections etc.
    - 
