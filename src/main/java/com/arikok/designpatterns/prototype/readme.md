Prototype is all about copying an object to an another. 
    - A partially or fully initialized object that you copy (clone) and make use of.

- Complicated object aren't designed from scratch 
    - They reiterate existing designs
- An existing (partially or full constructed) design is a Prototype
- We make a copy (clone) the prototype and customize it
    - Requires 'deep copy' support
- We make the cloning convenient (e.g., via a Factory) 

- To implement a prototype, partially construct an object and store it somewhere
- Clone the prototype
    - Implement your own deep copy functionality; or 
        - Serialize and deserialize

In real world best way is copying a object is serialize&deserialize in my opinion
