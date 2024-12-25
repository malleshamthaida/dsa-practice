import java.util.Arrays;

public class TestApp2 {
    /*

    Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]

    output=  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

     */


    public static void main(String[] args) {
        int numsArr[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
           int newArr[]=  convertArray(numsArr);
        Arrays.stream(newArr).forEach(System.out::print);
    }
    public static int[] convertArray(int[] arr){
        int left=0,right=arr.length-1;

       while(left<right){
           if(arr[left]==0){
               left++;
           }else{
               arr[left++]=0;
           }
           if(arr[right]==1){
               right--;
           }else{
               arr[right--]=1;
           }



       }


        return arr;

    }
}
