import java.util.*;

public class Ite {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(8);

    Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
