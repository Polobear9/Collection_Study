import java.util.*;

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

        ObjectPocket<Hero> heroPocket1 = new ObjectPocket();
        heroPocket1.setData(new Hero("minato"));
        Hero hero1 = heroPocket1.getData();
        System.out.println(hero1.getName());

        ObjectPocket<Monster> monsterPocket1 = new ObjectPocket();
        monsterPocket1.setData(new Monster("slime"));
        Monster monster1 = monsterPocket1.getData();
        System.out.println(monster1.getMonster_name());

        //ArrayList instance type.
        new ArrayList<String>();
        new ArrayList();
        new ArrayList<Object>();

        ArrayList<String> list1 = new ArrayList<String>();
        List<String> ArrayList2 = new ArrayList<String>();
        Collection<String> list3 = new ArrayList<String>();

        ArrayList2.add(0, "hoge"); // array list can not point the index number.
        //List is suggest to user use a interface into the super class when they use a instance method.

        ArrayList2.add("Apple");
        ArrayList2.add("banana");
        ArrayList2.add("melon");
        ArrayList2.add("strawberry");
        ArrayList2.add("tenjerling");
        System.out.println(ArrayList2.size());
        int[] sample = new int[5];
        sample[0] = 0;

        try {
            ArrayList2.add(6, "apple");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please set the in index Number --> " + ArrayList2.size() + " ");
            System.out.println("Sample... ArrayList2.add(" + ArrayList2.size() + ", element)");
        } finally {
            System.out.println("Finish");
        }

        ArrayList2.set(1, "Jerry");

        Stack<String> stack = new Stack<String>();

        stack.push("apple");
        stack.push("banana");
        stack.push("strawberry");

        System.out.println("Stack: " + stack);

        stack.isEmpty(); // check the stack is empty or not.
        stack.pop();

        HashSet<String> set = new HashSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("strawberry");

        System.out.println("Set: " + set);

        HashMap<String, String> mapTest = new HashMap<>();
        mapTest.put("1", "strawberry");
        mapTest.put("2", "banana");
        mapTest.put("3", "apple");
        mapTest.put("4", "mango");

        System.out.println("Map: " + mapTest);

        mapTest.replace("2", "Pear");

        System.out.println("Map: " + mapTest);

        mapTest.remove("2");

        System.out.println("Map: " + mapTest);

    }
}