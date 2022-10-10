import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
      int retry = 1;
      System.out.println("================================");
      System.out.println("FIBONNACI SERIES CALCULATOR");
      System.out.println("================================");
      while(retry == 1){
        int f1 = 0;
        int f2 = 1;
        int sum = 1;
        System.out.print("Fibonnaci value of ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if(n<1){
            System.out.println("Error: Invalid Input!");
        }else if (n == 1) {
            System.out.println("fibonnaci(1) = 0");
        } else if (n == 2) {
            System.out.println("fibonnaci(2) = 1");
        } else {
            for (int i = 3; i <= n; i++) {
              sum = f1 + f2;
              f1 = f2;
              f2 = sum;
            }     
            System.out.println("fibonnaci("+n+") = "+sum);
         }
        System.out.println("================================");
        System.out.print("Enter (0) Exit (1) Retry: ");
        retry = Integer.parseInt(scanner.nextLine());
        System.out.println("================================");
      }
    }
}