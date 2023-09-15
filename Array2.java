import java.util.*;
class Input{
	void scanner(){		
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter Size of array");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter "  + n + " element ");
	for(int i=0; i<arr.length; i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0; i<n; i++){
		System.out.print(arr[i] + " ");
	}
	}
}
class Array2{
	public static void main(String ar[]){
	Input a=new Input();
a.scanner();	
	}	
	}