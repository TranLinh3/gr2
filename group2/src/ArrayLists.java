
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        Iterator<String> iterator = list.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}