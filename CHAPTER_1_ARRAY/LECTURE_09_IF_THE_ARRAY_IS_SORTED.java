package DSA.CHAPTER_1_ARRAY;

public class LECTURE_09_IF_THE_ARRAY_IS_SORTED {
    public static boolean cheakSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4};
        boolean result=cheakSorted(arr);
        System.out.println(result);
    }
}
