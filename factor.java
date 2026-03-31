
// Input 1 :
// 55
// Output 1 :
// 1 
// 5 
// 11 
// 55 
// The count of factors: 4
// Input 2 :
// 15
// Output 2 :
// 1 
// 3 
// 5 
// 15 
// The count of factorsInput 1 :
// 55
// Output 1 :
// 1 
// 5 
// 11 
// 55 
// The count of factors: 4
// Input 2 :
// 15
// Output 2 :
// 1 
// 3 
// 5 
// 15 
// The count of factors


import java.util.*;
public class factor {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println(i+" ");
            }
        }
        System.out.print("The count of factors: "+count);
    }
}

