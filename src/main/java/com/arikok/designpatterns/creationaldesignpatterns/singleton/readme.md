Singleton - A component which instantiated only once
 
- For some components it only makes send to have one in the system
    - Database repository
    - Object Factory
- E.g., the constructor call is expensive
    - We only do it once
    - We provide everyone with the same instance   
- Want to prevent anyone creating additional copies
- Need to take care of lazy instantiation and thread safety


- Serialization problem:
    - JVM don't care the constructor is private or public, so if you serialize and deserialize the component, you will have another copy of your singleton
    - To solve it : you need to add below method to give hints to JVM. JVM will call this method and you will same singleton object.
        protected Object readResolve(){
            return INSTANCE;
        }

- Static Block singleton
    - You can create a static block and do the initialization task in it.     

- Laziness and Thread Safety
    - Laziness will create the instance inside getInstance method. So it wont create the instance until it called.
    - But it could create a race condition, so you can mark  getInstance method to synchronized
    - Another option is double-checked locking
    
        public static LazySingleton getInstance(){
        if(instance == null){
             synchronized(LazySingleton.class){
                 if ( instance == null){
                  instance = new LazySingleton()
                 }      
             } 
        }
        return instance;
        } 
    - Another option to solve thread-safe is InnerStatic Singleton. A inner static class is used for this implementation.
        - Inner classes can access outside classes private constructor method.
        
- Enum Based Singletons
    - You cant serialize it effectively.
    - Serialization process of a Enum doesnt include serialize private properties of Enum. Only names are serialized.
    

- Summary:
    - Making a 'safe' singleton is easy: construct a static Lazy<T> and return its value
    - Singletons are difficult to test, Instead of directly using a singleton consider depending on an abstraction (e.g., an interface)
    - Consider defining singleton lifetime in DI container

