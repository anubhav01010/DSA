package DSA.CHAPTER_1_ARRAY;

public class LECTURE_07_DUPLICATE_ELEMENTS_FINDING {
//    public static void Duplicate(int[] arr,int n){
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("The duplicate number is "+arr[j]);
//                }
//
//            }
//        }
//    }

  // function for removing  duplicates from sorted array

    public static int dupFun(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,5};
        int n=arr.length;
       // Duplicate(arr,n);
        System.out.println(dupFun(arr));
    }
}
