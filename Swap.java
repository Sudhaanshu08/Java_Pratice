import java.util.*;
class Swap{
	public static void main(String ar[]){
    
	Scanner sc=new Scanner(System.in);
int z;
	  System.out.println("Enter First Element");
	  int n1=sc.nextInt();
	  System.out.println("Enter Second Element");
	  int n2=sc.nextInt();
	  z=n1;
	  n1=n2;
	  n2=z;
	  System.out.println("1st Element "+ n1);
	  System.out.println("2nd Element "+n2);
}	
}