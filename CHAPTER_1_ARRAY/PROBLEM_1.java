package DSA.CHAPTER_1_ARRAY.CHAPTER_1_ARRAY;
import java.util.*;
public class PROBLEM_1 {

    public static int cheak(int arr[],int n){

        if(n==1){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
               return arr[i];
           }
       }
         return 0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array you want---> ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array...");
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }

        int result=cheak(arr,n);
        System.out.println(result);
    }

}
