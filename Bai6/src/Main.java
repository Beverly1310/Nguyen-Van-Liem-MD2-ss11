import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round(Math.random()*100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)>list.get(j)){
                    int tg = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,tg);
                }
            }
        }
        System.out.println(list);
    }
}