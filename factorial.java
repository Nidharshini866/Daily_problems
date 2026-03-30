
// Find the factorial of the given number.
// Example:
// 5! = 5 * 4 * 3 * 2 * 1 = 120
// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// 120

import java.util.Scanner;
public class factorial {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
}
