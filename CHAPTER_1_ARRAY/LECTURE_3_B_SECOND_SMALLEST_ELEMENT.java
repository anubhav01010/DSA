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

    public static int fun(int[] arr){
        int smallest=arr[0];
        int secSmallest=-1;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                secSmallest = smallest;
                smallest = arr[i];
            }else if(secSmallest>arr[i] && smallest<arr[i]){
                secSmallest=arr[i];
            }
        }
        return secSmallest;
    }

    public static void main(String[] args) {
        int []arr={6233,1,545,5,76778};
        int result=secondSmallestElement(arr);
        System.out.println(result);
        System.out.println(fun(arr));

    }
}
