// Input 1 :
// 6
// Output 1 :
// 6 is a perfect number
// Input 2 :
// 50
// Output 2 :
// 50 is not a  perfectInput 1 :
// 6
// Output 1 :
// 6 is a perfect number
// Input 2 :
// 50
// Output 2 :
// 50 is not a  perfect


import java.util.Scanner;

public class perfect_number {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print(n+" is a perfect number");
        }else{
            System.out.print(n+" is not a  perfect number");
        }
    }
}
