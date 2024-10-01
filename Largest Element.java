import java.util.*;
public class LargestElement{
    public static void main(String args[]){
    int arr1[]={2,5,1,2,4};
    System.out.println("the largest element is"+ sort(arr1));
    int arr2[]={5,6,4,3,2};
    System.out.println("The largest element in 2 nd arr is"+ sort(arr2));

}
static int sort(int arr[]){
    Arrays.sort(arr);
    return arr[arr.length-1];

    
}}
