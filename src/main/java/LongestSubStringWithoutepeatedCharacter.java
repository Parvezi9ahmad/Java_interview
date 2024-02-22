import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutepeatedCharacter {

    public static void main(String[] args) {
       /* String s = "ABCDEFGABEF";
        System.out.println("Longest substring without repeating characters: " + longestSubstringWithoutRepeating(s));*/
        String s="ABCDEFGABEF";
        String longestSubstring=null;
        int longestSubstringlength=0;
        Map<Character,Integer> mapValue=new HashMap<>();
         char[] chars = s.toCharArray();
         int start=0;
         int maxstart=0;
         int maxlenght=0;
         for(int i=0;i<chars.length;i++){
             char ch=chars[i];
            if(mapValue.containsKey(ch)) {
                start=mapValue.get(ch)+1;
            }
            mapValue.put(ch,i);
            if(i-start+1>maxlenght){
                maxlenght=i-start+1;
                maxstart=start;
            }
         }
        String substring = s.substring(maxstart, maxstart + maxlenght);
        System.out.println(substring);
    }
}
