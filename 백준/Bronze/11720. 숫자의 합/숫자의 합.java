import java.util.*;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();
        
        char[] num2Array = num2.toCharArray();
        int sum = 0;
        for(int i=0; i<num2Array.length; i++){
            sum+= num2Array[i] - '0';
        }
        System.out.print(sum);
    }
}