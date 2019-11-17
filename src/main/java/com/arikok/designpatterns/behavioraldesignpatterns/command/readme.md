Command

- Ordinary Java statements are perishable
    - Cannot unda a field assignment
    - Cannot directly serialize a sequence of actions (calls)
- Want an object that represents an operation
    - X should change its field Y to value Z
    - X should do w()
- Uses: GUI commands, multi-level undo/redo, macro recording and more!

An object which represents an instruction to perform a particular action. Contains all the information necessary for the action to be taken.

Summary
    - Encapsulate all details of an operation in a separate object
    - Define instruction for applying the command (either int he command itself or elsewhere)
    - Optionally define instructions for undoing the command
    - Can create composite commands ( AKA macros)
