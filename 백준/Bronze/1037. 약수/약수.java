import java.util.*;

public class Main{
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int num[] = new int[a];
        for(int i=0; i<a; i++){
            num[i] = scan.nextInt();
        }

        Divisor d1 = new Divisor(num);
    }
}

class Divisor{

    public Divisor(int[] num){
        int max = num[0];
        int min = num[0];

        for(int i=1; i<num.length; i++){
            if(max < num[i]) max = num[i];
            else if(min > num[i]) min = num[i];
        }
        System.out.println(min * max);
    }
}
