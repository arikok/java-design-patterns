Decorator : Facilitates the addition of behaviors to individual objects without inheriting from them. 

- Want to augment an object with additional functionality
- Do not want to rewrite or alter existing code (OCP)
- Want to keep new functionality separate (SRP)
- Need to be able to interact with existing structures
- Two options : 
    - Inherit from required object if possible; some classes are final
    - Build a Decorator, which simply references the decorated objects
    

