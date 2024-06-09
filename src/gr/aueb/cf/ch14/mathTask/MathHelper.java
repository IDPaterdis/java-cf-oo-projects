package gr.aueb.cf.ch14.mathTask;

public class MathHelper {
   private MathHelper(){}

    public static int findMax(int[] arr){
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
       return max;
    }
    public static int findMin(int[] arr){
       int min = Integer.MAX_VALUE;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }
       return min;
    }

    public static double average(int[] arr){
       int avg = 0;
       for( int i = 0; i < arr.length; i++){
           avg += arr[i];
       }
       return avg / arr.length;
    }

}
