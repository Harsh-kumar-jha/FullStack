# Test

### 1) What are Access Modifiers in Java?

- Access modifiers in Java determine the visibility and accessibility of classes, fields, methods, and constructors.
- There are four access modifiers: public, private, protected, and the default (package-private).

### 2) When to use public, private, protected?

- Use public when you want a member to be accessible from any other class.
- Use private when you want to restrict access to only within the declaring class.
- Use protected when you want to allow access within the package and by subclasses.

### 3) What is Inheritance?

- Extending the property of one class to another class is called `Inheritance` . Using `extends` keyword we can achieve inheritance.
- Inheritance is of 4 type
  1. Single-level
  2. Multi-level
  3. Multiple (not supported in java)
  4. Hierarchical inheritance

### 4) What is Single Level and Multi-Level Inheritance?

- Single Level Inheritance: A class inherits from only one superclass.
- Multi-Level Inheritance: A class inherits from another class, and then another class inherits from it, forming a chain.

### 5) Why Java Doesn’t support Multiple Inheritance?

- Java doesn't support multiple inheritance to avoid the "diamond problem," where ambiguity may arise if a class inherits from two classes with a common ancestor.

### 6) What is Encapsulation?

- Encapsulation mean wrapping properties and method into a single unit is called `Encapsulation`. We can achieve Encapsulation using `class` keyword.

### 7) Why to declare variables as private?

- Declaring variables as private ensures that they are only accessible and modifiable within the class, promoting encapsulation and data hiding.

### 8) What is the need of setter and getter methods?

- Setter methods allow you to set the values of private variables, ensuring controlled access.
- Getter methods allow you to retrieve the values of private variables.

### 9) What is Polymorphism?

- Exhibiting multiple behaviors on situation is called as `Polymorphism`. There are 2 Type of polymorphism
  1. Compile Time Polymorphism - achieve using method overloading
  2. Run Time Polymorphism - achieve using method overriding

### 10) What is Method Overloading and why we need it?

- Method overloading allows a class to have multiple methods with the same name but different parameter lists.
- It enhances code readability and provides flexibility.

### 11) What is Method Overriding and why we need it?

- Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
- It is essential for achieving runtime polymorphism.

### 12) What is Abstract Method?

- An abstract method is a method declared in an abstract class but has no implementation in the abstract class. Subclasses must provide the implementation.

### 13) What is Interface and why we need interfaces?

- An interface is a collection of abstract methods. Classes implement interfaces, providing a contract for the methods they must implement.
- Interfaces support multiple inheritance and help achieve abstraction.

### 14) What is Abstract Class and Why we need them?

- An abstract class is a class that cannot be instantiated and may contain abstract methods.
- They are used to provide a common base for multiple classes and to declare abstract methods.

### 15) Difference between Interface and Abstract Classes

- Abstract classes can have constructors, while interfaces cannot.
- Classes can implement multiple interfaces, but they can only inherit from one abstract class.
- Abstract classes may have non-abstract methods with a default implementation, while interfaces cannot.

### 16) What is Marker Interface and why we need them?

- A marker interface is an interface with no methods. It serves as a tag to inform the compiler or runtime about the class's behavior.
- Examples include Serializable and Cloneable.

### 17) What is difference between this keyword and super keyword?

- `this` refers to the current instance of the class.
- `super` refers to the superclass, used to access superclass members or call superclass methods.

### 18) What is final keyword and when to use it?

- `Final` keyword is use to mark a variable as constant and it value can't be change.
- Whenever we want a variable who's value remain constant throughout the program execution then we use final keyword

### 19) What is the use of var args?

- Var-args (variable-length argument lists) allow a method to accept a variable number of arguments.
- They are represented by an ellipsis `(...)` and are useful when the number of arguments is not known at compile-time.

### 20) What is Object class?

- The Object class is the root class for all Java classes. It provides methods like `equals()`, `hashCode()`, `toString()`, etc.

### 21) What is Cloning?

- Cloning is the process of creating an exact copy of an object. In Java, it is achieved through the `Cloneable` interface and the `clone()` method.

### 22) Can you explain all methods of Object class?

- Some important methods: `equals()`, `hashCode()`, `toString()`, `getClass()`, `clone()`, `finalize()`, `notify()`, `notifyAll()`, `wait()`.

### 23) When to override equals ( ) method ?

- Override the `equals()` method when you want to compare the content of objects rather than their references.

### 24) What is the difference between String class equals ( ) method and Object class equals ( ) method ?

- The String class overrides the `equals()` method to compare the content of strings, while the Object class equals() method compares object references.

### 25) What is hashcode ?

- The `hashCode()` method returns a hash code value for the object. It is a unique identification number which holds address of the corresponding object.

### 26) How to create Object for a class without using new keyword?

- You can create an object without using the new keyword by using methods like `Class.forName("className").newInstance()` or through reflection. Note that these methods may have limitations and are not commonly used in regular code.
