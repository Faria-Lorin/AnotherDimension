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

  public static  int sum(int[][] arr) {
    return ArrayOps.sum(ArrayOps.sumRows(arr));
  }


  public static  int[] sumCols(int[][] arr) {
    int[] fin = new int[arr[0].length];
    int[] sums = new int[arr.length];
    for (int col = 0; col < arr[0].length; col++){
    for (int row = 0; row < arr.length; row++){
      sums[row] = arr[row][col];

    }
    fin[col] = ArrayOps.sum(sums);
  }
    return fin;
  }


  public static boolean isRowMagic(int[][] matrix) {
    boolean x = true;
    int [] arr = ArrayOps.sumRows(matrix);
    for (int i = 0; i < arr.length -1; i++){
      if (arr[i] != arr[i+1]){
        x = false;
      }
    }
    return x;
}

  public static boolean isColMagic(int[][] matrix) {
  boolean x = true;
  int [] arr = ArrayOps.sumCols(matrix);
  for (int i = 0; i < arr.length -1; i++){
    if (arr[i] != arr[i+1]){
      x = false;
    }
  }
  return x;
}


  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
   int[] Arow = new int[col];
   int[] Acol = new int[row];
   for (int r = 0; r < matrix.length; r++){
     Acol[r] = matrix[r][col];
   }
   for (int c = 0; c < matrix[0].length; c++){
     Arow[c] = matrix[row][c];
  }
  if (ArrayOps.sum(Acol) == ArrayOps.sum(Arow)){
    return true;
  }
  else return false;
}

}
