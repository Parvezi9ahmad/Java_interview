import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input="AABCDEBBC";
        input.chars().sorted().forEach(s-> System.out.print((char)s));
        Map<Character,Integer> mapValue=new HashMap<>();
        for(int i=0;i<input.length();i++){
             char ch = input.charAt(i);
            if(mapValue.containsKey(ch)){
                mapValue.put(ch,mapValue.get(ch)+1);
            }
            else{
                mapValue.put(ch,1);
            }
        }
        System.out.println(mapValue);
        for(Map.Entry<Character, Integer> entries : mapValue.entrySet()){
            if(entries.getValue()==1){
                System.out.print(entries.getKey());
                break;
            }
        }

    }
}
