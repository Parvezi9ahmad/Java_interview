import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfEachCharInString {
    public static void main(String[] args) {
        String str="aabbcccd";
        Map<Character,Integer> mapValue=new HashMap<>();
        char[] chars = str.toCharArray();
        int count=0;
        for(char ch:chars){
            if(mapValue.containsKey(ch)){
                mapValue.put(ch,mapValue.get(ch)+1);
                count++;
            }
            else {
                mapValue.put(ch,1);
            }
        }
        System.out.println(mapValue);

    }
}
