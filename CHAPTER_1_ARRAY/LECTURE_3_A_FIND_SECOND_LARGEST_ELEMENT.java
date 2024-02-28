package DSA.CHAPTER_1_ARRAY;

public class LECTURE_3_A_FIND_SECOND_LARGEST_ELEMENT {
    public static void main(String[]args) {
        int[] arr = {23, 3454, 6576, 879};
        int res=secLargest(arr);
        System.out.println(res);
    }
    public static int secLargest(int[] arr) {
        int largest = arr[0];
        int secLargest = -1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest=arr[i];
            } else if (arr[i] > secLargest && secLargest < largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }}
