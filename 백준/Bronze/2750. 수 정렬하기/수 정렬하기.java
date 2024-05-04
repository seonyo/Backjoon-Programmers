import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(sc.nextInt());
        }
        ArrayList <Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}