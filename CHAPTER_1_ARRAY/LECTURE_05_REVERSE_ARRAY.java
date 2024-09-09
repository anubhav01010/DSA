package DSA.CHAPTER_1_ARRAY;

public class LECTURE_05_REVERSE_ARRAY {

    public static void reverseArray(int[] arr, int min, int max){


        while(max > min ){
           int temp=arr[max];
            arr[max]=arr[min];
            arr[min]=temp;
            max--;
            min++;
        }

    }
    public static void printA(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){

        int[] arr={2,4,6,8};
        reverseArray(arr,0,3);
        printA(arr);


        }
    }
//        int n=5;
//
//        for(int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//        System.out.println("Reversed array is: ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//


