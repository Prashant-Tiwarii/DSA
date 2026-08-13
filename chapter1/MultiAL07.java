package chapter1;
import java.util.*;
public class MultiAL07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        //initialization
        for(int i = 0; i < 3; i++){
            list1.add(new ArrayList<>());
        }

        //adding elements
        for(int i = 0; i < 3; i++){
            for(int j = 1; j <= 3; j++){
                list1.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list1);
    
}
}
