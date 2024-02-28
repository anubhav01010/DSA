package DSA.CHAPTER_1_ARRAY;

public class LECTURE_3_B_SECOND_SMALLEST_ELEMENT {
    public static int secondSmallestElement(int[]arr){
        int smallestE=arr[0];
        int secondSmallestE=-1;
        for(int i=0;i<arr.length;i++){
            if(smallestE>arr[i]){
                secondSmallestE=smallestE;
                smallestE=arr[i];
            }else if(secondSmallestE>arr[i]&&smallestE<arr[i]){
                   secondSmallestE=arr[i];
            }
        }
        return secondSmallestE;
    }
    public static void main(String[] args) {
        int []arr={6233,1,545,5,76778};
        int result=secondSmallestElement(arr);
        System.out.println(result);

    }
}
