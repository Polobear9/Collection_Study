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

        ObjectPocket<Hero> heroPocket1 = new ObjectPocket();
        heroPocket1.setData(new Hero("minato"));
        Hero hero1 = heroPocket1.getData();
        System.out.println(hero1.getName());

        ObjectPocket<Monster> monsterPocket1 = new ObjectPocket();
        monsterPocket1.setData(new Monster("slime"));
        Monster monster1 = monsterPocket1.getData();
        System.out.println(monster1.getMonster_name());
    }
}