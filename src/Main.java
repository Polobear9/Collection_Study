import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new ArrayList();
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.get(0); // --> get(index) is Object Type. need to Cast to String.

        String apple = (String) list.get(0);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Apple");
        list2.get(0); // --> <E>..get(index) is can change the type to <E>. so do not need to cast.

        String apple2 = list2.get(0);
    }
}