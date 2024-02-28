package DSA.CHAPTER_1_ARRAY;
import java.util.Scanner;
public class LECTURE_1ASUM_OF_ALL_ELEMENT {
    public static int Sum(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       /*
        System.out.println("The elements of array is as following");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        */
        int result=Sum(arr,n);
        System.out.println("The Sum of elements is as following:"+result);


    }

}
