import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {
    List<String> ar = Arrays.asList(new String[]{"a","b","c","d","e"});
    List<String> ar2 = Arrays.asList(new String[]{"a","b","c","d","e"});

        System.out.println(ar);

//        ar.stream().forEach(x->
//        {
//            System.out.print(x);
//            try {
//                Thread.sleep(1000);
//                System.out.println("hi");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        ar.stream().forEach(x-> System.out.print(x));
        System.out.println();
        ar2.stream().filter(x->(x.equals("m"))).   (Comparator.comparing(o->o.toString()).reversed()).forEach(x-> System.out.print(x+"hj"));
    }
}
