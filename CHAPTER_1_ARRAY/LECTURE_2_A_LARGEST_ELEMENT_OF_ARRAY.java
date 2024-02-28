package DSA.CHAPTER_1_ARRAY;

public class LECTURE_2_A_LARGEST_ELEMENT_OF_ARRAY {
    public static int largestE(int[] arr) {
        int largest = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (largest <= arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={23,43,45,56,67};
        int result=largestE(arr);
        System.out.println("The largest element present at "+ result);
    }
            }
