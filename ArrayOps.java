import java.util.Arrays;
public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    int [] x = {1,2,3,4,5,5};
    System.out.println(ArrayOps.sum(x));
  }
}
