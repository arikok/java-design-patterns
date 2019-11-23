Observer
- We need to be informed when certain things happen
    - Objects fields changes
    - Object does something
    - Some external event occurs
- We want to listen to events and notified when they occur
- Typically pattern involves addXXXlistener()
- Java now has functional objects
    - Supplier<T>,Consumer<T>,Function<T>

An observer is an object that wishers to be informed about events happening in the system. The entity generating the events is an observable.
 
- Observer is an intrusive approach: an observable must provide an event to subscribe to
- Special care must be taken to prevent issues in multi-threaded scenarios
- Rx uses Observer<T> Observable<T>
