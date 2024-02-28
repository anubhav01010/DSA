package DSA.CHAPTER_1_ARRAY;

public class LECTURE_2_B_SMALLEST_ELEMENT {
    public static int smallestElement(int[]arr){
        int smallE=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallE){
                smallE=arr[i];
            }
        }
        return smallE;
    }
    public static void main(String[] args) {
        int[] arr={23,545,56,778,1};
        int result=smallestElement(arr);
        System.out.println(result);
    }
}
