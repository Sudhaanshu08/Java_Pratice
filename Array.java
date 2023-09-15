class max{
	void Largest(){		
		int arr[]={4,3,2,2,10};
        int ans=0;
   for(int i=0; i<arr.length; i++){
	   if(arr[i]>ans){
		   ans=arr[i];
	   }
   }
   System.out.println(ans);
	}
}


class Array{
	public static void main(String ar[]){
	max a=new max();
a.Largest();	
	}	
	}