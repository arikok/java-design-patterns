- Composite : A  mechanism for treating individual(scalar) objects and compositions of objects in a uniform manner

- Objects use other object's fields/methods through inheritance and composition
- Composition lets us make compound objects
    - E.g., a mathematical expression composed of simple expressions; or 
    - A shape group made of several different shapes
- Composite design pattern is used to treat both single(scalar) and composite objects uniformly
    - I.e., Foo and List<Foo> have common API's

- Summary
    - Objects can use other objects via inheritance/composition
    - Some composed and singular objects need similar/identical behaviors
    - Composite design pattern lets us treat both types of objects uniformly
    - Java supports container iteration with the Iterable<T> interface
    - A single object can masquerade as a collection by returning a single-element collection containing only this
