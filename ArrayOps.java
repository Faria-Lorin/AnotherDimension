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

  public static int[] sumRows(int[][] matrix) {
      int[] arr = new int[matrix.length];
      int[] sums = new int[matrix.length];
      for (int row = 0; row < matrix.length; row++){
      for (int col = 0; col < matrix[0].length; col++){
        sums[col] = matrix[row][col];

      }
      arr[row] = ArrayOps.sum(sums);
    }
      return arr;
  }

  public static  int[] largestInRows(int[][] matrix){
    int[] arr = new int[matrix.length];
    int[] large = new int[matrix.length];
    for (int row = 0; row < matrix.length; row++){
    for (int col = 0; col < matrix[0].length; col++){
      large[col] = matrix[row][col];

    }
    arr[row] = ArrayOps.largest(large);
  }
    return arr;
  }

  public static void main(String[] args) {
  /*int [] x = {1,2,3,4,5,5};
    System.out.println(ArrayOps.sum(x));
    int [] x = {1,2,3,4,15,5};
    System.out.println(ArrayOps.largest(x));
    int[][] matrix = new int [5][2];
    for (int row = 0; row < matrix.length; row++){
    for (int col = 0; col < matrix[0].length; col++){
      matrix[row][col] = 2;
    }
  }
    System.out.println(Arrays.toString(sumRows(matrix)));*/
    int i = 10;
    int[][] matrix = new int [5][2];
    for (int row = 0; row < matrix.length; row++){
    for (int col = 0; col < matrix[0].length; col++){
      matrix[row][col] = i;
      i++;
    }
  }
    System.out.println(Arrays.toString(largestInRows(matrix)));
  }
}
