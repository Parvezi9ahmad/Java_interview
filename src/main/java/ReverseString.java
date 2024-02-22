import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "java";
        Stream<StringBuilder> stringBuilderStream = Stream.of(str).map(s -> new StringBuilder(s).reverse());
        stringBuilderStream.forEach(s -> System.out.println(s));
        Function<String, String> f1 = s -> new StringBuilder(s).reverse().toString();
        System.out.println(f1.apply(str));
        char[] charr = str.toCharArray();
        for (int i = charr.length - 1; i >= 0; i--) {
            System.out.print(charr[i]);
        }
        System.out.println("");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
