Chain of Responsibility

- Unethical behavior by an employee; who takes the blame? 
    - Employee
    - Manager
    - CEO
- You click a graphical element on a form
    - Button handles it, stop further processing
    - Underlying group box
    - Underlying window
- CCG computer game
    - Creature has attack and defense values
    - Those can be boosted by other cards
    
A chain of components who all get a chance to process a command or a query, optionally having default processing implementation and an ability to terminate the processing chain.

Command Query Separation
    - Command = asking for an action or change (please set your attack value to 2)
    - Query = asking for information (please give me your attack value)
    - CQS = having separate means of sending commands and queries to eg, direct field access

Summary
    - Chain of responsibility can be implemented as a chain of references or a centralized construct
    - Enlist objects in the chain, possibly controlling their order
    - Object removal from chaing (e.g, in AutoCloseable's close())
