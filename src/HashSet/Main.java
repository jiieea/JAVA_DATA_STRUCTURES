package HashSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(5));

        for(int i = 0; i < 10; i++) {
            if(hashSet.contains(i)) {
                System.out.println(i + " exist in the hashset");
            }else {
                System.out.println(i + " does not exist in the hashset");
            }
        }
    }
}
