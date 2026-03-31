// Hint:- Power of 4 for number 5=625 (end digit of 625 is 5).
// Sample 1:
// Input
// 5
// Output:
// TRUE



// Sample 2:
// Input
// 4
// Output:
// FALSE     (Power of 4 for number 4=256)  Hint:- Power of 4 for number 5=625 (end digit of 625 is 5).



import java.util.Scanner;
public class power {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int a=(int)Math.pow(n,4);
    int b=a%10;
    if(n==b){
        System.out.print("TRUE");
    }
    else{
        System.out.print("FALSE");
    }
}
}
