package DSA.CHAPTER_1_ARRAY;
import java.util.Scanner;
public class problem_01_finding_the_number_is_prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==2){
            System.out.println("The number is Prime number.");
        }else{
            for(int i=2;i<num-1;i++){
                if(num % i==0){
                    System.out.println("The num is Composite number.");
                    break;
                }else{
                    System.out.println("The num is Prime number.");
                    break;
                }
            }
        }
    }
}
