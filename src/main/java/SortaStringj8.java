import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortaStringj8 {
    public static void main(String[] args) {
        String str="parvez";
        final String collect = Stream.of(str.split("")).sorted().collect(Collectors.joining());
        System.out.println(collect);

        String str1 = "parvez";
        str1.chars().sorted().forEach(s -> System.out.print((char) s));
    }
}
