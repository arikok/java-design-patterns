Visitor - Allows adding extra behaviors to entire hierarchies of classes

- Need to define a new operation on entire class hierarchy
    - Eg. make a document model printable to HTML/Markdown
- Do not want to keep modifying every class in the hierarchy
- Need access to the non-common aspects of classes int he hierarchy
- Create an external components to handle rendering
    - But avoid type checks
    
A pattern where a component (visitor) is allowed to traverse the entire inheritance hierarchy. Implemented by propagating a single visit() method through the entire hierarchy

- Propagate an accept(Visitor v) method throughout the entire hierarchy
- Create a visitor with visit(Foo), visit(Bar) for each element in the hierarchy
- Each accept() simple calls visitor.visit(this)
- Acyclic visitor allows greater flexibility at a cost to performance
