- If we dont declare any explicit constructor then default constructor is implicitly declared
- A constructor implicitly returns the type of the object that it creates
- Constructors help maintain encapsulation when injecting state into object
- If we specify any constructor then the default one is not called
- Constructor overloading - declaring multiple constructors with different parameters.
- Constructor chaining - where one constructor explicitly calls another overloaded constructor
** Only a constructor can call another constructor

- An interesting use of constructors in Java is in the creation of Value Objects. A value object is an object that does not change its internal state after initialization.