import java.util.*;
public class tuf{
    public static void main(String args[]){
        int arr1[]={2,5,1,3,2,4};
        System.out.println("the largest element is "+findlargest(arr1));
        
    }
    static int findlargest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
