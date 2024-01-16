# Test 1

1. **What is full stack development?**

—> Full-Stack Development means Creating Frontend as well as Backend website

—> Frontend means Creating User interface for end users so that they can interact with our website. 

Tech stack used for frontend development → HTML, CSS, JavaScript ,React/Angular/Vue

—> Backend is the hidden part of our website which contain business logic 

Tech Stack used for backend development → NodeJs(expressJs),Python(Django),Java(Spring boot),C#(.net),…etc + Any database of our interest.

1. **Explain software project architecture**
    
    ![scheme.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/6bde3fbc-1b4f-4882-8fe1-39897df608ad/0531753e-7254-460c-bab7-00546d677ba3/scheme.jpg)
    

→ This is the basic Web Application Architecture

1. **What are the roles & responsibilities of full stack developer**

—> Understand Requirement of the project

—> Analyze requirements

—> Design Planning

—> Database Design

—> Testing (unit Testing)

—> Code Review 

—> Code Integration

—> Frontend Development 

—> Frontend + Backend Integration

—> Deployment

—> Support / Maintenance

1. **What is database and why we need it?**

—> Database is a Software where we can store user information.

—> There are various Database software available in the market

eg :- MySQL, SQL Server, Oracle Database , MongoDB,…etc 

1. **What is programming language & why we need programming language?**

—> A Programming Language is for developers to develop some application for Human kind. Programming Language is use for interacting with computer system to develop applications.

1. **What is JAVA?**

—> Java is a programming Language.

—> Java was developed by James Gosling at sun micro System in the year of 1991.

—> Initially Java was called as ‘OAK’ programming Language. But in 1995 it was renamed to Java.

—> Now Java is under the license of Oracle Corporation.

—> Java is free and open source.

### Java is Divided into 3 Parts

- **J2SE/JSE** → Java Standard Edition (Core Java)
    
    → To Develop Stand alone applications. 
    
    → Run on only  in one Machine.
    
    eg: Calculator ,Games, Notepad,…etc
    

- **J2EE/JEE** → Java Enterprise Edition (Adv Java)

     → To Develop Web Application

     → Everybody can Access web application using internet

     eg:  gmail , youtube , facebook ,…etc

  

- **J2ME/JME** → Java Micro/Mobile Edition

     → To Develop Mobile Appliaction

     eg: Whatsapp, messger, Phonepay,…etc

1. **What are the features of java?**

→ Simple

→ Robust

→ OOPs Support

→ Security is High

→ Multi-Threading is Possible

→ Platform Independent

→ Portable

→ Distributed

→ Dynamic in nature

1. **What is the difference between C and Java?**

→ The main Difference is 

→ C Language is  platform dependent means if compiled in windows machine then the compiled code can not run on mac or linux base machine.

→ But, Java language is platform independent means java compiled code which is .class file can run on any machine which has jvm. 

1. **What type of applications we can develop using java & brief them**

→ Using Java we can Develop 

- Stand alone applications means application which can run on one machine. eg→ calculator, games, Notepad,..etc
- Web application and anyone can access those application using internet. eg→ gmail, youtube, facebook,…etc
- We can also develop mobile application using java. eg→ whatsapp, phonepe, gpay,…etc
1. **What is the difference between JDK, JRE and JVM?**

—> JDK stands for java development kit which provide set of tools to develop the program and compile the program.

—> JRE stands for java run time environment which will provide us java virtual machine.

—> JVM stands for java virtual machine which will execute the compiled java code into any machine. 

1. **What is the execution flow of java program?**
    
    ![904273_orig.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/6bde3fbc-1b4f-4882-8fe1-39897df608ad/7afcb7d8-8a1e-406a-af63-4a83515c6e08/904273_orig.png)
    
2. **What is the difference between interpreter and compiler?**

—> An Interpreter is a translator which is use to execute a programming language line by line (Performance is low)

—> A Compiler is also an translator but it will execute whole program directly. (Performance is high)

1. **Write JVM architecture & explain JVM components**

—> JVM (Java Virtual Machine) consist of several components →

- **class Loader Subsystem** → is responsible to load .class(byte code) file into JVM.
- **Method area** → stores class code.
- **Heap area** → Objects will be stored here.
- **Java Stack** → Method execution information will be stored here.
- **PC register** → it will maintain next line information to execute.
- **Native Stack** → will store non-java code execution information
- **Native Library** → Non-java Library is required for native code execution.
- **Native interface** → will load native library into jvm.
- **Execution engine** → it is responsible to execute the program and provide output.
1. **What is JIT?**

—> JIT stands  for just-in-time complier which is use to speed up execution process.

1. **Write Java data types with size, range and default values**

—> Java has two type of data types

1. Pre-Define
    1. Integral 
        1. Byte (1 bytes, -128 to 127, 0)
        2. short(2 bytes, -32768 to 32767, 0)
        3. int(4 bytes,-2147483648 to 2147483647, 0)
        4. long(8 bytes,-9223372036854275808 to 9223372036854275807 , 0l)
    2.  Decimal 
        1. float (4 bytes, upto 6 decimal place , 0.0f)
        2. double (8 bytes, upto 15 decimal place , 0.0)
    3. Character
        1. char (2 bytes, , ‘u0002’)
    4. Boolean
        1. boolean (1 bit, true or false, false)
2. User define (Reference)
    1. Arrays
    2. Strings
    3. Classes
1. **What is variable and how to create variables**

—> Variable are use to hold data. Its like an container

**Syntax** → <data_type> <variable_name> = <value>

1. **Explain Java program elements**
- Package statement (optional)
- Import statements (optional)
- Class Declaration (most important)
- Variable declaration
- Method declaration
1. **Write a java program to print welcome message**

```java
class HelloWorld {
    public static void main(String... args){
        System.out.println("Hello, World!!");
    }
}
```

1. **Write a java program on variables declaration, initialization**

```java
class VariablesDeclaration {
	public static void main(String... args){
		byte a = 10;
		short b = 132;
		int c = 123455;
		long d = 1211412l;
		boolean isValid = true;
		char firstLetter = 'H';
		float percentage = 84.56f;
		double percentile = 83.13928;
	}
}
```

1. **How many types of comments available in java**

—> There are 3 Types of comments available in java 

- Single line comments ( // )
- Multi-line comments (/*  */)
- Documentation comments (/**  */) —> are used to provide meta data
1. **What is identifier and what are rules available for identifier**

—> All the names which we are using for variables, classes, methods, packages, interfaces …etc are called identifier.

—> Rules for identifiers

- Only a-z , A-Z , 0-9 , $, _ are used for identifiers
- The first character of identifier should not be a digit
- No Special character are allowed except $ and _.
- Java Reserved words should not be used as identifier.
- Java is case sensitive language mean foo and Foo both are different for java language.
1. **What are the reserved words in java**

—> The reserved words have some meaning which are predefined by java language.

—> There are 53 Reserved words in java.

- Keywords (50)
    - Used keyword (48)
        - int
        - else
        - for
        - if
        - …etc
    - Un-used keywords(2)
        - goto
        - const
- Reserved Literals (3)
    - true
    - false
    - null
1. **Write Java Naming Conventions for packages, classes, variables and methods**

—> Java naming conventions are not mandatory but highly recommended to follow any every java developer.

1. Naming conventions for packages
    
    → java package can have any number of words.
    
    → if there are multiple words then it is separated using .(dot).
    
    eg: java.lang , [java.io](http://java.io) ,…etc
    
2. Naming conventions for classes 
    
    → java classes can have any number of words
    
    → Every words first character should be capital and rest should be lowecase.
    
    eg: Welcome , UserRestApiController , …etc
    
    → classes and interface both have same naming convention
    
3. Naming convention for variables
    
    → java variable can have any number of words.
    
    → if there are multiple words then first word will be in lower case and after first word from second word onward first char will be capital.
    
    eg: user,creditCardNumber,userExperience, …etc
    
4. Naming convention for methods
    
    → Variables and method naming convention is same.
    
    → the difference between variable and method is that method will have ‘()’ in the end.
    
    eg: user(). userExperience(),userRestController(),…etc