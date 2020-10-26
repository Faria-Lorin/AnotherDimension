import java.util.Arrays;
public class Tester{

    public static void main(String[] args) {
      System.out.println("\nTests for sum of an array:");
      int [] x = {1,2,3,4,5,5};
      System.out.println(ArrayOps.sum(x));

      System.out.println("\nTests for largest element of an array:");
      int [] q = {1,2,3,4,15,5};
      System.out.println(ArrayOps.largest(q));

      int[][] arr = new int [5][5];
      for (int row = 0; row < arr.length; row++){
      for (int col = 0; col < arr[0].length; col++){
        arr[row][col] = 2;
      }
    }
      int i = 10;
      int[][] matrix = new int [5][2];
      for (int row = 0; row < matrix.length; row++){
      for (int col = 0; col < matrix[0].length; col++){
          matrix[row][col] = i;
          i++;

          }
        }
      System.out.println("\nTests for sum of rows:");
      System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
      System.out.println(Arrays.toString(ArrayOps.sumRows(arr)));
      System.out.println("\nTests for sum of columns:");
      System.out.println(Arrays.toString(ArrayOps.sumCols(matrix)));
      System.out.println(Arrays.toString(ArrayOps.sumCols(arr)));
      System.out.println("\nTests for largest in rows:");
      System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
      System.out.println(Arrays.toString(ArrayOps.largestInRows(arr)));
      System.out.println("\nTests for sum of all values in an array:");
      System.out.println(ArrayOps.sum(matrix));
      System.out.println(ArrayOps.sum(arr));
      System.out.println("\nTests for isRowMagic:");
      System.out.println(ArrayOps.isRowMagic(matrix));
      System.out.println(ArrayOps.isRowMagic(arr));
      System.out.println("\nTests for isColMagic:");
      System.out.println(ArrayOps.isColMagic(matrix));
      System.out.println(ArrayOps.isColMagic(arr));
      System.out.println("\nTests for isLocationMagic:");
      System.out.println(ArrayOps.isLocationMagic(matrix, 4, 1));
    }
}
