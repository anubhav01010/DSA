package DSA.CHAPTER_1_ARRAY;

public class LECTURE_08_FINDING_PEAK_ELEMENT {
    /*
    * 1.brut force approach
    * Follow the below steps to Implement the idea:

     # If the first element is greater than the second or the last element is greater than the second last, print the respective element and terminate the program.
     # Else traverse the array from the second index to the second last index i.e. 1 to N – 1
     # If for an element array[i] is greater than both its neighbors, i.e., array[i] > =array[i-1]  and array[i] > =array[i+1] , then print that element and terminate.
    * */
    public static int findPeakElementIndex(int[] arr){
        int l=arr.length;
        if(1==l){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
// cheak for every other element
            for(int i=1;i<l-1;i++){
                if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                    return i;
                }
        }
            return 0;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,0};
        int indPeak=findPeakElementIndex( arr);
        System.out.println(indPeak+" "+arr[indPeak]);

    }
}
