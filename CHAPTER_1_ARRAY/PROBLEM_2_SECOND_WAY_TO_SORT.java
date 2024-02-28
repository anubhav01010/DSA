package DSA.CHAPTER_1_ARRAY;
import java.util.*;
public class PROBLEM_2_SECOND_WAY_TO_SORT {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements of array...");
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
        System.out.println(arr[n-1]);

    }
    }

