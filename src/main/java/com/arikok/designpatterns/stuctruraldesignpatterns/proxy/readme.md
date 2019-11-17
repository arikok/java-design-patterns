Proxy
= An interface for accessing a particular resource

- You are calling foo.bar()
- This assumes that foo is in the same process as bar()
- What if,later on, you want to put all Foo-Related operations into a separate process
     - Can you avoid changing your code?
- Proxy to the rescue!
    - Same interface, entirely different behavior
- This is called a communication proxy
    - Other types: logging, virtual, guarding...

A class that functions as an interface to a particular resource. That resource may be remote, expensive to construct, or may require logging or some other added functionality.

Proxy vs Decorator

- Proxy provide an identical interface; decorator provides an enhanced interface
- Decorator typically aggregates (or has reference to) what it is decorating; proxy doesnt have to
- Proxy might not even be working with a materialized object

Summary
- A proxy has the same interface as the underlying object
- To create a proxy, simply replicate the existing interface of an object
- Add relevant functionality to the redefined member functions
- Different proxies (communication,logging,caching etc.) have completely different behaviors
