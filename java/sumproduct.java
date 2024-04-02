// using taking [input form user] we use scanner class which we have to import..


import java.util.*; // All java files classes are there in util

public class sumproduct{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);

// SUM

System.out.println("Enter 1st number");
int a = sc.nextInt();
System.out.println("Enter 2nd number");
int b = sc.nextInt();
int sum = a+b;
System.out.println("sum = "+sum);

// PRODUCT

System.out.println("Enter 1st number");
int x = sc.nextInt();
System.out.println("Enter 2nd number");
int y = sc.nextInt();
int product = x*y;
System.out.println("Product = "+product);

}
}