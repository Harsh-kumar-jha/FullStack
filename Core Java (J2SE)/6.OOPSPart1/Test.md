# Test

### 1. What is Class ?

- Class is plan to create an object
- Class is a blue print to create an object
- Class is use to declare variable and property

### 2. What is Object ?

- Object is real-world entity.
- Object is an instance of class.
- Object creation means allocating memory in jvm.
- 'new' keyword is used to create objects.

### 3. Why we need to Create Object ?

- Objects allow us to model and represent real-world entities in our software.
- They provide a way to structure and organize code in a modular fashion.
- Objects help achieve encapsulation, allowing data and methods to be bundled together.

### 4. What is instance variable and why we need them ?

- An instance variable is a variable that is associated with an instance of a class.
- It holds data specific to an object created from the class.
- Instance variables are declared in the class but are assigned values when objects are instantiated.

### 5. When memory will be allocated for instance variables ?

- Memory will be allocated for instance variables when the object is created then jvm will allocate memory for instance variables

### 6. How many times memory will be allocated for instance variables ?

- Memory is allocated only once for each instance variable, regardless of the number of objects created from the class.

### 7. What is static variable and why we need them ?

- A static variable is a class-level variable shared among all instances of the class.
- It is declared using the static keyword and is not tied to a specific instance but to the class itself.

### 8. When memory will be allocated for static variables ?

- Memory will be allocated for static variables when class is loaded into the jvm.

### 9. How many times memory will be allocated for static variables ?

- Memory is allocated only once for each static variable, regardless of the number of objects created from the class.

### 10. What is Local Variable & Why we need Local Variable ?

- A local variable is a variable declared within a method or a block of code.
- It is only accessible within the scope in which it is defined.

### 11. When Memory will be allocated for local variable ?

- Memory for local variables is allocated when the method or block containing the variable is executed and is released when the method or block exits.

### 12. What is Constructor why we need Constructor ?

- A Constructor is a special method which is automatically get called whenever an object is create.
- It is used to initialize the object's state and set values for instance variables.

### 13. What are the rules to write Constructor ?

- The constructor name must be the same as the class name.
- It has no return type, not even void.
- It may have parameters.

### 14. What is Constructor Overloading & Why we need it ?

- Constructor overloading is having multiple constructors within a class, each with a different set of parameters.
- It allows for the creation of objects with different initialization options.

### 15. What is Method and Why we need methods ?

- A method is a function associated with an object or class. It defines the behavior of the objects created from the class.

### 16. When to take method parameter and method return type ?

- Method parameters are used when the method requires external data to perform its task.
- Return types are specified if the method produces a result that needs to be used by the calling code.

### 17. When to use primitive type for method parameters & return types ?

- Use primitive types when the data involved is simple and doesn't require additional behavior.

### 18. When to use Object as method parameter & return type?

- Use objects as parameters and return types when dealing with complex data structures or when additional behavior is needed.

### 19. What is Object Oriented Language ?

- An object-oriented language is a programming language that supports the principles of object-oriented programming, including encapsulation, inheritance, and polymorphism.

### 20. What are OOPS principles?

- OOPs have 4 main pillars

  1. Encapsulation - warping data and property into single uint is call "Encapsulation". Using 'class' keyword we can achieve Encapsulation

  2. Abstraction - hiding implementation details or un-necessary data and showing only required data is call "Abstraction". We can achieve Abstraction using Interfaces and Abstract classes.

  3. Inheritance - Extending the property from one class to another class is called "Inheritance".Using "extends" keyword we can inherit the properties to another class.

  4. Polymorphism - Exhibiting multiple behaviors based on situation is called as "Polymorphism". Polymorphism is of two Type

     1. Compile Time Polymorphism - it can be achieved using "method overloading"
     2. Run Time Polymorphism - it can be achieve using "Method overriding"
