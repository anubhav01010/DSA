package DSA.CHAPTER_1_ARRAY;
import java.util.Scanner;
public class LECTURE_00_ARRAY_BASIC {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       // (1) Way one of declaring array
        int[] arr2={23,34,5,67,4};
        System.out.println(arr2.length);
        System.out.println(arr2[3]);


     // (2) Way two to declare array
        int[] arr=new int[5];
//        arr[0]=2;
//        arr[1]=3;
//        arr[2]=45;
//        arr[3]=16;
//        arr[4]=17;
//        System.out.println(arr[4]);

    System.out.println("Enter all elements of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
     System.out.println("The elements of array is:");
     // loop used to print all elements of array
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
}
