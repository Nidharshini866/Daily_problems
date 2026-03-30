
// Input 1 :
// 3
// 4 6 8
// Output 1 :
// 24



import java.util.*;
public class Magical_Ritual{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lcm=arr[0];
        for(int i=1;i<n;i++){
            int x=lcm;
            int y=arr[i];
            while(y!=0){
                int temp=y;
                y=x%y;
                x=temp;
            }
            int gcd=x;
            lcm=(lcm*arr[i])/gcd;
        }
        System.out.print(lcm);
    }
}