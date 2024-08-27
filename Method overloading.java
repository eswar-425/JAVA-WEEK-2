//Write a program to print method overloading
class Mol{
void mul(int a,int b)
{
 System.out.println("Multiplication of two numbers is : "+(a * b));
}
void mul(int a,int b,int c) 
{
 System.out.println("Multiplication of three numbers is: "+(a * b * c));
}
public static void main(String args[]){
Mol obj = new Mol();
obj.mul(2,3);
obj.mul(3,5,76);
}
}
Output : Multiplication of two numbers is : 6
         Multiplication of three numbers is: 1140
