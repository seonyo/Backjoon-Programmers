import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int cnt = sc.nextInt();
        
        int num[] = new int [cnt];
        for(int i=0; i<cnt; i++){
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num);
        
        for(int i=0; i<cnt; i++){
            int find = num[i];
            int p1 = 0;
            int p2 = cnt - 1;
            while(p1 < p2){
                if(num[p1] + num[p2] == find){
                    if(p1 != i && p2 != i){
                        answer++;
                        break;
                    } else if(p1 == i){
                        p1++;
                    } else if (p2 == i){
                        p2--;
                    }
                } else if (num[p1] + num[p2] < find){
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        System.out.println(answer);
    }
}