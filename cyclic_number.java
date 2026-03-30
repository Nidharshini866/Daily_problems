
// Input 1 :
// 12345
// 45123
// Output 1 :
// Yes


import java.util.*;
public class cyclic_number {
    // You are using Java

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char[] arr=b.toCharArray();
        boolean r=false;
        for(int i=1;i<=arr.length;i++){
        ArrayList<Character> li=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            li.add(arr[j]);
        }
        Collections.rotate(li,i);
        StringBuilder sb=new StringBuilder();
        for(char d:li){
            sb.append(d);
        }
        if(a.equals(sb.toString())){
            r=true;
            break;
        }
        }
        if(r){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}

