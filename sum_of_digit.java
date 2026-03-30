// Input: 9875

// Output: 2

// (Explanation: 9+8+7+5=29, 2+9=11, 1+1=2)Input: 9875

// Output: 2

// (Explanation: 9+8+7+5=29, 2+9=11, 1+1=2)

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        while(n>=10){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        n=sum;
         
        }
      System.out.print(n);
        
    } 
}
