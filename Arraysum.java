import java.util.*;
class Array{
	void max(){
		int arr[]={2,4,8,9,20};
		int ans=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>ans){
				ans=arr[i];
			}
		}
		System.out.println(ans);
		
	}
}
class Arraysum{
public static void main(String ar[]){
Array a=new Array();
a.max();
}
}