// METHOD IN JAVA

/*  WHAT IS A METHOD IN JAVA?
// A method in Java is a block of code that performs a specific task. It is a collection

1. A method should be named according to the task it performs
example: play()

2. There is a standard way of naming.

a. a method should always start with lowercase 
b. if a method is a composite name:
   i. the first word should start with lowercase
   ii. the second word should start with uppercase
example: playGame(), nextInt(), nextDouble(), nextLine()

3. How do we create a method in Java?
a. what do we need to create a method in Java?
   i. access modifier
   ii. return type
   iii. method name
   iv. parameter list
   v. method body

example:
public void play(){

}

Access modifier are 4:

*public: means other classes in different a package can access it
*default: means class in the same package can access it
*private: means only the class itself can access it
*protected: means class in the same package and subclasses in different packages can access it


Method re-use is when one method calls another method to perform a task. 

if two methods perform a same task in one package, is considered as duplicated methods, better to create a method in one class and call it in another class.

Types of methods in Java:
-------------------------

1. Parameterized method: is a method that takes parameters as input to perform a task.
example: public void play(int numberOfPlayers, String gameName){

}
2. Non-parameterized method: is a method that does not take any parameters as input to perform a task.

example: public void play(){

}

Return type :
--------------

Is a data type that returned by a method after performing a task. It can be any data type in Java.


=====> Remember that the output of a method is same data type as type of method return type.

*/


package auca.masoro.education;
import java.util.Scanner;
public class Education {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    public static void greet(){
        System.out.println("From Education Class");
    }
    
}
