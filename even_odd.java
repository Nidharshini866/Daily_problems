// Input 1 :
// 2873546183037
// Output 1 :
// 29 28
import java.util.*;
public class even_odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int even=0;
        int odd=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(Character.getNumericValue(a)%2==0){
                even+=Character.getNumericValue(a);
            }
            else{
                odd+=Character.getNumericValue(a);
            }
        }
        System.out.print(odd+" "+even);
    }
} 

