import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(12);
        list.add(4);
        list.add(6);
        list.add(54);
        list.add(6);
        list.add(878);
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(4);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)==list.get(j)){
                    list.remove(list.get(j));
                   i--;
                }
            }
        }
        System.out.println(list);
    }
}