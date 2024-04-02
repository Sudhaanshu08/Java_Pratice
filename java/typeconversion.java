/*
Happen only when 
1. Type compatible
2. destination > Source type

Type Conversion or Type Casting :
The process of changing the data type of a variable from one type to another.

[byte -> short -> int -> float -> long -> double]

1. Implicit Type Conversion:  A smaller data type is converted to a larger data type 
[Note *  conversion is done automatically by the Java compiler.]


2. Explicit Type Conversion : Explicit conversion, on the other hand, is 
like giving direct instructions. You explicitly tell 
Java how to convert data from one type to another by using casting, 
where you specify the type you want the data to be converted to.

int cup = 5; // Integer variable
double bucket = (double) cup; // Explicitly converting cup to a double

*/
public class typeconversion {
    public static void main(String[] args) {
        // Implicit Type Conversion
        int numInt = 10;
        double numDouble = numInt; // Implicit conversion from int to double

        System.out.println("Implicit Conversion:");
        System.out.println("Integer: " + numInt);
        System.out.println("Double: " + numDouble);

        // Explicit Type Conversion (Casting)
        double priceDouble = 20.50;
        int priceInt = (int) priceDouble; // Explicit conversion from double to int

        System.out.println("\nExplicit Conversion (Casting):");
        System.out.println("Double: " + priceDouble);
        System.out.println("Integer: " + priceInt);
    }
}
