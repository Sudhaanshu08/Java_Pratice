import java.util.*;
class Search{
	void se(){
		int arr[]={2,5,6};
		int x=5;
		int ans=-1;
	for(int i=0; i<arr.length; i++){
		if(arr[i]==x){
			 ans=i;
			break;
	}
	}
	System.out.println("Found" + x +"at Index " +ans );
}
}
class SearchI{
public static void main(String ar[]){
Search a=new Search();
a.se();
}
}