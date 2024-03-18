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
ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i <   list.size(); i++) {
            if (list.get(i)%2!=0){
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }
}