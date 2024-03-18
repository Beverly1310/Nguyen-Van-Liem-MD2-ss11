import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        ArrayList<String> listString = new ArrayList<>();
        String[] arrStr= str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            listString.add(arrStr[i]);
        }
        String minStr = arrStr[0];
        for (String string : arrStr) {
            if (minStr.length()>string.length()) {
                minStr=string;
            }
        }
        System.out.println(minStr);
    }
}