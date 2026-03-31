import java.util.*;

public class First_Num_With_n_Divisor {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        while (true) { 
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==n){
                System.out.print(num);
                break;
            }
            num++;
        }
    }
}
