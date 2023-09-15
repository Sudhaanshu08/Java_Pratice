import java.util.*;
class Occurance{
	void oc(){
		int arr[]={1,5,3,5,5,5,5};
		
		int c=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==5){
				c++;
			}
	}
	System.out.println(c);
}
}
class Array3{
public static void main(String ar[]){
Occurance a=new Occurance();
a.oc();
}	
}