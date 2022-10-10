import java.util.*;
public class MissingValue {
    public static void main(String[] args) {
      int[] arr = {5, 2, 1, 6, 3, 7, 8};
      int n = 8;
      boolean[] temp = new boolean[n];
      for (int i = 0; i < arr.length; i++) {
        int val = arr[i];
        temp[val - 1] = true;
      }
      int m = 0;
      for (int j = 0; j < n; j++) {
        if (temp[j] == false) {
          m = j + 1;
        }
      }
      System.out.println("The missing value is "+m);
    }
}