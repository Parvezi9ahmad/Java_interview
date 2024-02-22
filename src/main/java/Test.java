import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String input="ABCDABCFDE";
        input.chars().sorted().forEach(s-> System.out.print((char)s));
        //System.out.println(input);
        Map<Character,Integer> mapValue=new HashMap<>();
         char[] chars = input.toCharArray();
         for(char ch:chars){
             if(mapValue.containsKey(ch)){
                 mapValue.put(ch,mapValue.get(ch)+1);
             }
             else {
                 mapValue.put(ch,1);
             }
         }
        System.out.println(mapValue);
        for(Map.Entry<Character, Integer> entries : mapValue.entrySet()){
            if (entries.getValue()==1){
                System.out.println(entries.getKey());
                break;
            }
        }
    }
}
