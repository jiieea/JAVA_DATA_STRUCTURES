package List.ArrayList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(100);
        linkedList.addLast(25);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}
