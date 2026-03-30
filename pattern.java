// Input 1 :
// 3 4
// Output 1 :
// 1, 0
// 1, 1
// 1, 2
// 1, 3
// 2, 0
// 2, 1
// 2, 2
// 2, 3
// 3, 0
// 3, 1
// 3, 2
// 3, 3


import java.util.Scanner;

public class pattern {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                System.out.println(i+", "+j);
            }
        }
    } 
}
