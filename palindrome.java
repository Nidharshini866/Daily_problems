// Input 1 :
// 12345
// Output 1 :
// Not Palindrome
// Input 2 :
// 54345
// Output 2 :
// Palindrome



import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s).reverse();
        if(s.equals(sb.toString())){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not palindrome");
        }

    
    }
}
