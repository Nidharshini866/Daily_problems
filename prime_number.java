// Input 1 :
// 10 20
// Output 1 :
// 11 13 17 19 
import java.util.*;
public class prime_number {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        boolean a=true;
        for(int i=start;i<end;i++){
            boolean r=true;
            if(i<=1){
                r=false;
            }
           else if(i==2){
                r=true;
            }
            else if(i%2==0){
                r=false;
            }
            else{
                for(int d=3;d*d<=i;d+=2){
                    if(i%d==0){
                        r=false;
                        break;
                    }
                }
                if(r){
                    System.out.print(i+" ");
                }
            }
           
            
        }
       
    }
}
