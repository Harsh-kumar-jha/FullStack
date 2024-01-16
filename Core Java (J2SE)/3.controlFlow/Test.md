# Test 2

1. What is Operator and why we need operators?

—> Operators are symbol which is use to perform some action on operands.

1. List down all the operators available in Java?

—> There are several types of operators in java

1. Arithmetic Operator
2. Relational Operators
3. Logical Operator
4. Assignment Operator
5. new operator
6. dot(.) operator
7. instanceof operator
8. ternary operator/conditional operator
1. What is the difference between Relational & Logical Operators?

—> Relational Operator are use to compare between two operand while logical operators are use to check multiple conditions

1. What is the purpose of 'new' operator?

—> new operator is use to create object in heap memory

1. What is the purpose of 'dot(.)' operator?

—> dot(.) operator is use to get or use method inside a class

1. What is the purpose of instance of operator?

—> The instanceof Operator is use to check if the given operand is instance of or belongs to the given class

1. What is the difference between "=" and "==" operators?

—> = is assignment operator which is use to assign value to variable. While == is to check if the given operands are equal or not 

1. What is the purpose of Control Statements & List down all the control statements
available in java?

—> The java program is execute line by line and in any project we need different output on hitting condition.

—> there are 3 types of control statements are available in java

1. control statements 
    1. simple if statement
    2. if-else statement
    3. if-else-if ladder
    4. switch case
2. looping statements
    1. while loop
    2. do-while loop
    3. for loop
    4. for-each loop
3. branching or jumping statements
    1. break
    2. continue
    3. return
1. Write a java program on if - else if - else ladder

```java
class CheckPositive {
	public static void main(String... args){
		int num = 22;
		if(num > 0) {
				System.out.println("Its an positive number");
			} else if(num < 0 ) {
				System.out.println("Its an negetive number");
			} else {
				System.out.println("Its an zero...");
			}
	}
}
```

1. Write a java program on 'switch' case

```java
class WeekDays {
	public static void main(String... args) {
		int dayNum = 4;
		switch(dayNum) {
			case 1 : System.out.println("Monday");
							 break;
			case 2 : System.out.println("Tuesday");
							 break;
			case 3 : System.out.println("Wednesday");
							 break;
			case 4 : System.out.println("Thursday");
							 break;
			case 5 : System.out.println("Friday");
							 break;
			case 6 : System.out.println("Saturday");
							 break;
			case 7 : System.out.println("Sunday");
							 break;
			default : System.out.println("No matching Day number .... ");
		}
	}
}
```

1. What is the difference between while & do-while loops

—> While loop runs only when condition is true else it will not run any single line of code inside while loop.

—> But, Even if the condition is false in do-while loop it will run atleast once.

1. Write a java program on 'while' loop

```java
class PrintingCountingNumber {
	public static void main(String... args){
		int i = 1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
	}
}
```

1. What is the difference between 'while' loop & 'for' loop

—> While loop works on condition that why it is called as condition based loop

—> For loop works on a perticular range that why it is called as Range based loop

1. Write a java program on 'for' loop

```java
class PrintingCountingNumber {
	public static void main(String... args){
		for(int i = 1; i<11 ; i++){
			System.out.println(i);
			i++;
		}
	}
}
```

1. Write a java program on 'nested for loop'

```java
class PrintingCountingNumber {
	public static void main(String... args){
		for(int i = 1 ; i<= 5 ; i++){
			for(int j = 1 ; j<=5 ; j++){
				System.out.print("* ");
				}
				System.out.println();
			}
	}
}
```

1. What is the difference between 'break' and 'continue' & 'return' keywords

—> break statement is use to come out from a loop and switch case

—> continue statement is use to skip the current iteration in the loop

—> return keyword is use to come out from method

1. Write a java program using 'break' keyword

```java
class PrintingCountingNumber {
	public static void main(String... args){
		int i = 1;
		while(i<=10){
				if(i == 5) {
					break;
				}
			System.out.println(i);
			i++;
		}
	}
}
```

1. Write a java program using 'continue' keyword

```java
class PrintingCountingNumber {
	public static void main(String... args){
		int i = 1;
		while(i<=10){
			if(i == 9) {
					continue;
				}
			System.out.println(i);
			i++;
		}
	}
}
```

19. what is the output ?

1. int a = 10;
if(a) {
sop("Hi");
} else {
sop("Hello");
}
==> Error
2. int a = 10;
if(a = 20) {
sop("Hi");
} else {
sop("Hello");
}
==> Error
3. int a = 10;
if(a <= 20) {
sop("Hi");
} else {
sop("Hello");
}
==> "Hi"
4. int a = 20;
switch (a) {
case "a" : sop("Hi");
case "b" : sop("Hello");
default : sop("bye");
}
==> Error
5. int a = 20;
switch (a) {
case 1 : sop("Hi");
case 2 : sop("Hello");
default : sop("bye");
}
==> "bye"
6. int a = 1;
switch (a) {
case 1 : sop("Hi");
case 2 : sop("Hello");
default : sop("bye");
}
==> "Hi"
"Hello"
"bye"
7. while(true){
sop("Hi");
}
sop("Hello");
==> Error
8. while(false){
sop("Hi");
}
sop("Hello");
==> Error