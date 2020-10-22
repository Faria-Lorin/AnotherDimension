import java.util.Arrays;
public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[]arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++){
      max = Math.max(max, arr[i]);
    }
    return max;
  }

  public static void main(String[] args) {
  /*int [] x = {1,2,3,4,5,5};
    System.out.println(ArrayOps.sum(x));*/
    int [] x = {1,2,3,4,15,5};
    System.out.println(ArrayOps.largest(x));
  }


}
