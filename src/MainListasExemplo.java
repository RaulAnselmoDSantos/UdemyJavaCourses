import java.util.ArrayList;
import java.util.List;

public class MainListasExemplo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Raul");
        list.add("Nicole");
        list.add("Vovo");
        list.add("Mamae");
        list.add("Ana");
        list.add("Ronaldo");

        list.add(2, "Vovó");

        System.out.println(list.size());

        for (String s : list){
            System.out.println(s);
        }
        System.out.println("=--------------------------=");

        //Could be compared or index ex: list.remove("Ana") ou list.remove(4);
        list.remove("Ana");

        //This is a Lambda function with a predicate to identify an element by one filter
        // and do something in this case remove
        list.removeIf(s -> s.charAt(0) == 'V');

        for (String s : list){
            System.out.println(s);
        }
        System.out.println("=--------------------------=");

        //Here we are finding the index of an element using compare with the string
        System.out.println("Index of Mama " + list.indexOf("Mamae"));
        System.out.println("=--------------------------=");

        //Here we are making one new list using the previous as a base to the new
        // list but applying a filter were it's used a predicate to filter
        List<String> result = list.stream().filter( x -> x.charAt(0) == 'R').toList();
        for (String s : result){
            System.out.println(s);
        }
        System.out.println("=--------------------------=");

        //Here we have a way to find the first element in this filter using the predicate,
        String name = list.stream().filter(s -> s.charAt(0) == 'X').findFirst().orElse(null);
        System.out.println(name);
    }
}
