import java.util.*;
class Array{
    void sum(){ 
       int arr[]={1,5,5};
       int sum=0;
       for(int i=0; i<arr.length; i++){
           sum=sum+arr[i];
       }
        System.out.println(sum);
    }
}
class HelloWorld {
    public static void main(String[] args) {
    Array a=new Array();
    a.sum();
}
}