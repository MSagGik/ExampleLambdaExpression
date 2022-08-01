import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleLambdaExpression {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

        // реализация метода compare компаратора:
//        // с помощью анонимного класса:
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() > o2.length()) {
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        // с помощью лямбда выражения:
        list.sort((s1, s2) -> {
            if(s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });
        System.out.println(list);
    }
}
