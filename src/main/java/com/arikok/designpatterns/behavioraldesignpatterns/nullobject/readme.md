Null Object A behavioral design pattern with no behaviors

- When component A uses component B, it typically assumes that B is non-null
    - You inject B, not some Option<B> type
    - You do not check for null on every call
- There is no option of telling A not to use an instance of B
    - Its use is hard-coded
- Thus, we build a no-op, non-functioning inheritor of B(or some interface that B implements) and pass it into A


A no-op object that conforms to the required interface, satisfying a dependency requirement of some other object.

- Implement the required interface
- Rewrite the methods with empty bodies
    - If method is non-void, return default value for a given type
    - If these values are never used, your are in trouble
- Supply an instance of Null object in place of actual object
- Cross your fingers

It can be used for testing..
