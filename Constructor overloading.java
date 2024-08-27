//Write a program to implement a constructor overloading
class Con{
Con(int a){
System.out.println("Value of a is: "+a);
}
Con(int a,int b)
{
 System.out.println("Sum of two numbers is: "+(a + b));
}
public static void main(String args[]){
Con obj = new Con(10);
Con obj1 = new Con(10,20);
}
}
Output : Value of a is: 10
         Sum of two numbers is: 30
