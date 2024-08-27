//Write a program to implement a constructor
class Cons{
Cons(int a){
System.out.println("Value of a is: "+a)
}
Cons(int a,int b)
{
 System.out.println("Sum of two numbers is: "+(a + b));
}
public static void main(String args[]){
Cons obj = new Cons(10);
Cons obj1 = new Cons(10,20);
}
}
Output : Value of a is: 10
         Sum of two numbers is: 30
