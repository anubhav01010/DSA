package DSA.CHAPTER_1_ARRAY;

public class LECTURE_04_PALINDROME_PROBLEM {
    public static void main(String[]args){
        int[] arr={1,2,3,3,2,1};
        int n=6;
        int flag=0;
        for(int i=0;i<n/2;i++){

                if(arr[i]!=arr[n-1-i]) {
                    flag = 1;
                    System.out.println("Array is not palindromic");
                    break;
                }
            }
        if(flag==0){
            System.out.println("Array is Palindromic");
        }

    }
}
