Decorator : Facilitates the addition of behaviors to individual objects without inheriting from them. 

- Want to augment an object with additional functionality
- Do not want to rewrite or alter existing code (OCP)
- Want to keep new functionality separate (SRP)
- Need to be able to interact with existing structures
- Two options : 
    - Inherit from required object if possible; some classes are final
    - Build a Decorator, which simply references the decorated objects  

In  Dynamic Decorator and Static Decorator, 
    you wont be able to access underneath methods. You will only have the last implementation classes methods.   

- A decorator keeps the reference to the decorated objects
- May or may not forward calls
    - IDE can generate delegated members
- Exists in static variation
    - X<Y<Foo>>( /*Unpleasent contructor args */))
    - Very limited due to 
        - Type erasure
        - Inability to inherit from type parameters
