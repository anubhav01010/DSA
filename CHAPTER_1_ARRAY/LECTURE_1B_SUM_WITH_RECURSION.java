package DSA.CHAPTER_1_ARRAY;
import java.util.Scanner;
public class LECTURE_1B_SUM_WITH_RECURSION
{
    public static int recSum(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        else if(n==0){
            return 0;
        }
        else{
            return recSum( arr, n-1) +arr[n-1];
        }
    }
    public static void main(String[]args){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of Array: ");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("enter the elements of array: ");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int result=recSum(arr,n);
            System.out.println(result);
}}
