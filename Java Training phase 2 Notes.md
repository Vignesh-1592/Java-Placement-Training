###### 10.08.2026 - Java Training phase 2



Front-End:

&#x20;1. To get the primary goal from the user.

&#x20;2. To make the design presentable.



Back-End:

&#x20;1. Process the input from the user.



Database (DB):

&#x20;1. Store the process data.



API(Application Programming Interface)

&#x20;1. To integrate Frontend and Backend.

&#x20;2. API is just an URL, it just transfer the data.



&#x20;    \[User --> Front-End Server --> API --> Backend Server]



\------------------------------------------------------------------------------------------------------



JavaScript - 1. Young and Vibrant.

&#x09;     2. Easy to learn and pick up quickly.

&#x09;     3. Growing Rapidly and dominating web development space.

&#x09;     4. It gets into form at 2015.

&#x09;     5. ES6 is the best version of the JS, which changed the life of importance of JS.



Python - 1. Beginner - friendly and simple to use.

&#x09; 2. It is best for AI and Data science.



Java - 1. It's Security level is at peak.

&#x20;      2. Used to build web and mobile applications.

&#x20;      3. Needs more focus to learn the concept.



Two Important Terms for Software Process:

&#x09;1. Object

&#x09;2. Array of Objects



\------------------------------------------------------------------------------------------------------



###### ***Skills need to be learn for Full Stack Development:***



Front-End: HTML, CSS, JavaScript, Bootstrap, React.js

Back-End: Node.js, Express.js, Rest API, Spring Boot

Database: MongoDB, Mongoose, SQL



Framework - 1. It is a pre-built structure that helps developers build applications faster and in an organized way.

&#x09;    2. Instead of creating everything from zero, a framework gives you many things already prepared.

&#x09;    3. Makes easy work, acts as a template, contains libraries.

\------------------------------------------------------------------------------------------------------

###### 

###### ***Eclipse Workspace Setup:***



1\. Download JDK 21 version and Eclipse.

2\. Create a new file folder.

3\. Open eclipse and click files select switch source.

4\. Browse and select the created folder.

5\. It will restart the console and click Windows -> Windows view -> click -> Console and Project Explorer.

6\. Create a new Java Project and untick the module.info.

7\. Create a new file inside the source(src) and create a package, inside that create file and enter the file name of the project -> click ok.

8\. Follow this for all creation of java project.



======================================================================================================



***Example: Palindrome.java***

&#x09;

&#x09;package basics; //package name



&#x09;import java.util.\*; //--> Its a package to get input from the user

&#x09;public class Palindrome {

&#x09;	public static void main (String\[] args) {

&#x09;		Scanner sc = new Scanner(System.in);

&#x09;		System.out.println("Enter a number: ");

&#x09;		int input  = sc.nextInt();

&#x09;		int rev = 0;

&#x09;		int temp = input;

&#x09;		while(temp>0) {

&#x09;			int digit = temp%10;

&#x09;			rev = rev\*10 + digit;

&#x09;			temp/=10;

&#x09;		}

&#x09;		if(rev == input) {

&#x09;			System.out.println("It is a palindrome");

&#x09;		}

&#x09;		else {

&#x09;			System.out.println("It is not a palindrome");

&#x09;		}

&#x09;

&#x09;	}

&#x09;}



\------------------------------------------------------------------------------------------------------



###### ***Fundamentals of Programming:***



1. Data Types
-> Primitive (Only value can be stored)

&#x09;->int

&#x09;->double

&#x09;->long
->short

&#x09;->boolean

&#x20;  -> Non - Primitive (objects)

&#x09;-> Arrays

&#x09;-> Strings

2\. Variables

3\. Keywords

4\. Operators

5\. Conditional Statements

&#x09;-> if

&#x09;-> if-else

&#x09;-> else

6\. Loops

&#x09;-> while loop

&#x09;-> for loop

&#x09;-> do-while loop

&#x09;-> Jumping Statements:

&#x09;	-> break

&#x09;	-> continue

7\. Strings

8\. Arrays

9\. Functions (Methods)

&#x09;-> Always try to write the program using functions

&#x09;-> Don't write the code directly in main functions.

&#x09;-> \[return type method\_name] (Parameters) //int add(int a. int b){

&#x09;	|                             |

&#x09;	--> Method Declaration part   --> Input given by the user



&#x09;	int c = 0;

&#x09;	c = a + b;  // Method Definition Part;



&#x09;	return value; // return c;

&#x09;   }

&#x09;-> if return type is void --> Nothing will be returned as an output.

10\. Types of Methods:



*-> No parameter, no return*



void greet() {

&#x20;   System.out.println("Hello");

}



*-> Parameter, no return*



void greet(String name) {

&#x20;   System.out.println("Hello " + name);

}



*-> No parameter, returns value*



int getNumber() {

&#x20;   return 10;

}



*-> Parameter and returns value*



int add(int a, int b) {

&#x20;   return a + b;

}



\------------------------------------------------------------------------------------------------------



###### ***Stack vs Heap Memory:***



Stack: Stores function calls, local variables, and temporary data.

Heap: Stores objects and dynamically allocated data.



&#x20;                MEMORY

&#x20;      ┌─────────┴────────┐

&#x20;      │                        │

&#x20;    STACK                      HEAP

&#x20;      │                        │

&#x20;      │                        ├── Student object

&#x20;      │                        │

&#x20;      │                        │

&#x20;      ├── x = 10              |

&#x20;      │                        │

&#x20;      └── s  ─────────────┘

&#x20;             reference



STACK

→ Function calls

→ Local variables

→ Fast

→ Limited

→ LIFO



HEAP

→ Objects

→ Dynamic data

→ Larger

→ Runtime-managed



\------------------------------------------------------------------------------------------------------



###### **Note:**



***PascalCase:***

&#x09;PascalCase is a naming style where every word starts with a capital letter, and there are no spaces or special characters.



Example:

&#x09;StudentDetails

&#x09;CalculateTotal

&#x09;EmployeeManagementSystem

&#x09;GetUserDetails



Not PascalCase:

&#x09;studentDetails

&#x09;student\_details

&#x09;student details



======================================================================================================



***camelCase***

&#x09;camelCase is a naming style where the first word starts with a lowercase letter, and every following word starts with a capital letter. No spaces are used.



Examples:

&#x09;studentName

&#x09;calculateTotal

&#x09;employeeDetails

&#x09;getUserDetails



Not camelCase:

&#x09;StudentName

&#x09;student\_name

&#x09;student name



\------------------------------------------------------------------------------------------------------



###### **Object Oriented Programming:**



1. To keep the code clean we use OOPS Concept.
2. OOP (Object-Oriented Programming) is a programming approach where a program is designed using objects and classes to organize data and behavior together.
3. The 4 main principles of OOP are:

&#x09;-> Encapsulation → Binding data and methods together

&#x09;-> Inheritance → Acquiring properties and methods from another class

&#x09;-> Polymorphism → One interface/method, different behaviors

&#x09;-> Abstraction → Hiding unnecessary implementation details

4\. Object (Physical Entity, Occupies Memory) : An object is an ***instance of a class*** that represents a specific entity and contains its data and behavior. ---> It is like a big shopper bag where our details are stored in a object.

&#x09;	   ---> Example: Student Vignesh - Name, Roll.no, Section, Department.

&#x09;	                            |

&#x09;				    --> (where **Vignesh** object ***Stores*** details of him)

5\. Class (Logical Entity, Blueprint) : A class is a ***blueprint*** or template used to create objects, defining their data and methods.

======================================================================================================



Example:ClassAndObjectExample



6\. Note 1: For below Code, no memory is Allocated.

&#x09;

&#x09;package oops;



&#x09;class Shirt{

&#x09;	int product\_Id;    |

&#x09;	String proName;    |---> Instance Variable

&#x09;	float price;       |

&#x09;}

&#x09;public class ClassAndObjectExample {



&#x09;	public static void main(String\[] args) {



&#x09;	}

&#x09;}



7\. Note 2: Here the memory is allocated.



&#x09;package oops;



&#x09;class Shirt{

&#x09;	int product\_Id;

&#x09;	String proName;

&#x09;	float price;

&#x09;}

&#x09;public class ClassAndObjectExample {



&#x09;	public static void main(String\[] args) {

&#x09;		Shirt s1 = new Shirt();                         |

&#x09;		s1.product\_Id = 1002;                           |-----> Manually assigning values

&#x09;		s1.proName = "Peter England Casual Shirts";     |

&#x09;		s1.price =  2499.00f;				|

&#x09;		Shirt 2 = new Shirt();

&#x09;		Shirt 3 = null;

&#x09;	}

&#x09;}





***Stack and Heap Memory Understanding:***



STACK MEMORY                    HEAP MEMORY



+----------------+              +-------------------------+

| s1 | RT123     | -----------> | product\_Id = 1002       |

+----------------+              | proName = "Peter        |

| s2 | RT176     | ---------.   | England Casual Shirts"  |

+----------------+          |   | price = 2499.0          |

| s3 | null      |          |   +-------------------------+

+----------------+          |

&#x20;                           |   +-------------------------+

&#x20;                           '-->| product\_Id = 0           |

&#x20;                               | proName = null           |

&#x20;                               | price = 0.0              |

&#x20;                               +-------------------------+



======================================================================================================



Entity -> Data members(behaviour), Instance Variable, Properties.

Template ->

Table ->

this -> this keyword points current object



STACK

┌─────────────────────────────┐

│ signup() stack frame        │

│ userName → "Vignesh"        │

│ password → "1234"           │

│ email → "v@gmail.com"       │

│ mobile → 9876543210         │

├─────────────────────────────┤

│ p → Profile object          │

└──────────────┬──────────────┘

&#x20;                  │

&#x20;                  ↓

HEAP

┌─────────────────────────────┐

│ Profile object              │

│ userName                    │

│ uname                       │

│ age                         │

│ gender                      │

│ emailId                     │

└─────────────────────────────┘



Example 1:



package oops;



class Student{

&#x09;int rollno;	|

&#x09;String name;	|-------> Instance Variable

&#x09;char gender;	|

&#x09;int age;	|

}

public class SchoolSystem {



&#x09;public static void main(String\[] args) {

&#x09;	Student s1 = new Student();	|

&#x09;	s1.rollno = 158;		|

&#x09;	s1.name = "Vicky";		|------> Set values

&#x09;	s1.gender = 'M';		|

&#x09;	s1.age = 20;			|

&#x09;	System.out.println(s1.rollno +" "+ s1.name +" "+ s1.gender +" "+ s1.age); -----> get values

&#x09;}

}



======================================================================================================



Example 2: Using this keyword.



package oops;



class Student{

&#x09;int rollno;

&#x09;String name;

&#x09;char gender;

&#x09;int age;

&#x09;

&#x09;void setValues(int rollno, String name, char gender, int age){

&#x09;	this.rollno = rollno;

&#x09;	this.name = name;

&#x09;	this.gender = gender;

&#x09;	this.age= age;

&#x09;}

}

public class SchoolSystem {



&#x09;public static void main(String\[] args) {

&#x09;	Student s1 = new Student();

//		s1.rollno = 158;

//		s1.name = "Vicky";

//		s1.gender = 'M';

//		s1.age = 20;

&#x09;	s1.setValues(158, "Vicky",'M',20);

&#x09;	System.out.println(s1.rollno +" "+ s1.name +" "+ s1.gender +" "+ s1.age);

&#x09;}

}



\---------------------------------------------xxxxxxxxxxx----------------------------------------------





package oops;



class Employee1{

&#x09;int empId;

&#x09;String name;

&#x09;String gender;

&#x09;

&#x09;Employee1(){

&#x09;	System.out.println("Object Created!");

&#x09;	System.out.println("Created!");

&#x09;	System.out.println("");

&#x09;}

&#x09;Employee1(int empId, String name, String gender){

&#x09;	this.empId = empId;

&#x09;	this.name = name;

&#x09;	this.gender = gender;

&#x09;}

&#x09;void getEmployeeDetails() {

&#x09;	System.out.println(this.empId+" "+this.name+" "+this.gender);

&#x09;}

&#x09;

}



public class ConstructorExample {

&#x09;public static void main(String\[] args) {

&#x09;	Employee1 e1 = new Employee1();

&#x09;	Employee1 e2 = new Employee1(10,"Vicky","Male");

&#x09;	e2.getEmployeeDetails();		|

&#x09;	Employee1 e3 = new Employee1();		|--------> Constructor overloading

&#x09;	e3.getEmployeeDetails();		|

&#x09;}



}







Static(efficient memory allocation) variable -

static method -

\-----------------------------------------------xxxxxxxxxxxxxxxxxxxx-----------------------------------



Polymorphism - Method written in many forms.

&#x09;->Method overriding(run time polymorphism)

&#x09;->Method Overloading(compile time polymorphism) 

javac - compiler of java 



overloading -> same method name with different parameters

&#x09;   -> Happens within class

Overloading -> Happens different class

&#x09;    -> same parameter type /count



Annotation -> It gives the extra information to the compiler.



Abstraction -> hiding the implementation details. Used to hide method implementation details



\-> it can be achieved by abstract class(cannot achieve 100%).

\-> it can also be achieved by interface(can achieve 100% abstraction).

\-> we cant create a object for abstract class.

\-> abstract class method can be called in 3 different ways:

&#x09;-> using super keyword.

&#x09;-> call using child class object.

&#x09;-> you have to change the method into static in abstract class











