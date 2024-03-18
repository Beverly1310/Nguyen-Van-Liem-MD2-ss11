import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        System.out.println(list.contains(3));
//        list.add(3, 10);
        list.remove(3);
        System.out.println(list.indexOf(3));
        System.out.println(list.toString());

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list.get(5));
//        list.remove(3);
//        list.clear();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

    }
}