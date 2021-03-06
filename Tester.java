import java.util.Arrays;
public class Tester{

    public static void main(String[] args) {

      int [] x = {1,2,3,4,5,5};
      int [] q = {1,2,3,4,15,5};
      int [] r = {7,9,16,54,0, -1};
      int [] s = {-10,91,13,28,15,6};

      System.out.println("\nTests for sum of an array:");
      System.out.println(ArrayOps.sum(x));
      System.out.println(ArrayOps.sum(q));
      System.out.println(ArrayOps.sum(r));
      System.out.println(ArrayOps.sum(s));

      System.out.println("\nTests for largest element of an array:");
      System.out.println(ArrayOps.largest(x));
      System.out.println(ArrayOps.largest(q));
      System.out.println(ArrayOps.largest(r));
      System.out.println(ArrayOps.largest(s));

      int[][] arr = new int [7][7];
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

        int[][] kiwi = new int [2][8];
        for (int row = 0; row < kiwi.length; row++){
        for (int col = 0; col < kiwi[0].length; col++){
          kiwi[row][col] = 8;
        }
      }

      System.out.println("\nTests for sum of rows:");
      System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
      System.out.println(Arrays.toString(ArrayOps.sumRows(arr)));
      System.out.println(Arrays.toString(ArrayOps.sumRows(kiwi)));
      System.out.println("\nTests for sum of columns:");
      System.out.println(Arrays.toString(ArrayOps.sumCols(matrix)));
      System.out.println(Arrays.toString(ArrayOps.sumCols(arr)));
      System.out.println(Arrays.toString(ArrayOps.sumCols(kiwi)));
      System.out.println("\nTests for largest in rows:");
      System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
      System.out.println(Arrays.toString(ArrayOps.largestInRows(arr)));
      System.out.println(Arrays.toString(ArrayOps.largestInRows(kiwi)));
      System.out.println("\nTests for sum of all values in an array:");
      System.out.println(ArrayOps.sum(matrix));
      System.out.println(ArrayOps.sum(arr));
      System.out.println(ArrayOps.sum(kiwi));
      System.out.println("\nTests for isRowMagic:");
      System.out.println(ArrayOps.isRowMagic(matrix));
      System.out.println(ArrayOps.isRowMagic(arr));
      System.out.println(ArrayOps.isRowMagic(kiwi));
      System.out.println("\nTests for isColMagic:");
      System.out.println(ArrayOps.isColMagic(matrix));
      System.out.println(ArrayOps.isColMagic(arr));
      System.out.println(ArrayOps.isColMagic(kiwi));
      System.out.println("\nTests for isLocationMagic:");
      System.out.println(ArrayOps.isLocationMagic(matrix, 4, 1));
      System.out.println(ArrayOps.isLocationMagic(arr, 4, 1));
      System.out.println(ArrayOps.isLocationMagic(arr, 2, 1));
      System.out.println(ArrayOps.isLocationMagic(kiwi, 1, 1));

    }
}
