import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_ {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,7,4,-2);
//        Stream<Integer> stream__ = list.stream();
//        List<Integer> toList=stream__.toList();
//        System.out.println("count is " +" " +list.stream().count());
//        System.out.println("even is :");
//        list.stream().filter(u->u%2==0).forEach(System.out::println);
//        System.out.println("odd is ");
//        list.stream().filter(u->u%2!=0).forEach(System.out::println);
//        List<String> str= List.of("riz","khan","mine");
//        String result = str.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.joining(" "));
//        System.out.println(result);
//
//        list.stream().sorted().forEach(System.out::println);
//        list.stream().limit(5).skip(3).forEach(System.out::println);
//
      // Optional<Integer> first=list.stream().findFirst();
       // System.out.println(first.get());
      //  Set<Integer> setx = list.stream().collect(Collectors.toSet());

       // System.out.println(setx);
        int min=list.stream().min(Integer::compareTo).orElse(0);
        int max=list.stream().max(Integer::compareTo).orElse(0);
        int avg= (int) list.stream().mapToInt(i->i).average().orElse(0);
        //System.out.println(avg);

//        Map<String, List<Integer>> grouped = list.stream()
//                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));

      //  System.out.println(grouped);
       int sec= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(sec);}
}
