package DSA.CHAPTER_1_ARRAY;

public class LECTURE_10_REVERSE_THE_nUMBER {
    public static void funReverseNum(int num){
        int lastDigit=0;
        while(num>0){
            lastDigit=num%10;
            System.out.print(lastDigit+" ");
            num=num/10;
        }

    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        int num=12345;
         funReverseNum(num);

    }

}
