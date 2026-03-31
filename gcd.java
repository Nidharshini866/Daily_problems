// Input 1 :
// 56
// 98
// Output 1 :
// 14


import java.util.*;

public class gcd {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
while(y!=0){
    int temp=y;
    y=x%y;
    x=temp;
}
int gcd=x;
System.out.print(gcd);
}
}