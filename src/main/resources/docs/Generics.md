### Generics
> * Generics means **parameterized types**.  
> * The idea is to allow type _(Integer, String, … etc., and user-defined types)_ to be a parameter to methods, classes, and interfaces. 
> * Using Generics, it is possible to create classes that work with different data types.
---
### Why Generics?
The Object is the superclass of all other classes, and Object reference can refer to any object.
These features lack type safety. Generics add that type of safety feature.
---
### Types of Java Generics
#### 1. Generic Class

```java
class Test<T> {
  // An object of type T is declared
  T obj;

  Test(T obj) {
    this.obj = obj;
  } // constructor

  public T getObject() {
    return this.obj;
  }
}

// Driver class to test above
class Main {
  public static void main(String[] args) {
    // instance of Integer type
    Test<Integer> iObj = new Test<>(15);
    System.out.println(iObj.getObject());

    // instance of String type
    Test<String> sObj = new Test<>("GeeksForGeeks");
    System.out.println(sObj.getObject());
  }
}

```

#### 2. Generic Functions
```java 
// Generic functions

class Test {
    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}

```
---
### Type Parameters in Java Generics
The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

* T – Type
* E – Element
* K – Key
* N – Number
* V – Value

---
### Advantages of Generics
* Code Reuse: 
  * We can write a method/class/interface once and use it for any type we want.
* Type Safety: 
  * Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time rather than making your code fail at run time). 
  * Suppose you want to create an ArrayList that store name of students, and if by mistake the programmer adds an integer object instead of a string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.
  ```java
  import java.util.*;
      
      public class Test {
          public static void main(String[] args) {
              // Creating a ArrayList without any type specified
              ArrayList al = new ArrayList();
      
              al.add("Sachin");
              al.add("Rahul");
              al.add(10); // Compiler allows this
      
              String s1 = (String)al.get(0);
              String s2 = (String)al.get(1);
      
              // Causes Runtime Exception
              String s3 = (String)al.get(2);
          }
      }
      
  ```
  Output :
  > Exception in thread "main" java.lang.ClassCastException:
  java.lang.Integer cannot be cast to java.lang.String
  at Test.main(Test.java:19)
---
#### How do Generics Solve this Problem? 
When defining ArrayList, we can specify that this list can take only String objects.
```java
import java.util.*;

class Test {
    public static void main(String[] args) {
        // Creating a ArrayList with String specified
        ArrayList <String> al = new ArrayList<>();
        
        al.add("Sachin");
        al.add("Rahul");
        
        // Now Compiler doesn't allow this
        al.add(10); 
        
        // Individual Type Casting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
        String s3 = al.get(2);
    }
}

```
Output:
> 15: error: no suitable method found for add(int)  
> al.add(10);  
> ^
---

