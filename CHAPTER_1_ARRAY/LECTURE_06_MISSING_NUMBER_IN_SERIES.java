package DSA.CHAPTER_1_ARRAY;

public class LECTURE_06_MISSING_NUMBER_IN_SERIES {
    public static void main(String[]args){
        int[] arr ={1,2,5,4};
        int n=arr.length;
        int sum=0;
        int sum_n_naturel_numbers=(n+1)*(n+2)/2;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }
        int num=sum_n_naturel_numbers-sum;
        System.out.println("the missing number is: "+num);
    }
}
