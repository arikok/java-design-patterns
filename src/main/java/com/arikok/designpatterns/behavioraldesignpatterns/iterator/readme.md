Iterator - An object that facilitates the traversal of a data structure

How traversal of data structures happens and who makes it happen

- Iteration is a core functionality of various data structures
- An iterator is a class that facilitates the traversal
    - Keeps a reference to the current element
    - Know how to move to a different element
- Java has Iterator<T> and Iterable<T>
     - Iterator<T> specifies the iterator API
     - A class needs to be Iterable in order to support
        - For(Foo foo : bar) loops


- An iterator specified how you can traverse an object
- Iterator cannot be recursive (no co-routines)
- Iterator implements Iterator, iterable object implements Iterable
