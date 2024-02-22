import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RemoveDuplicateinString {
    public static void main(String[] args) {
        String str="pepsi";
        //new approach
        str.chars().distinct().forEach(s-> System.out.print((char)s));

        //approach 1
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println(sb);

        //approach-2
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<str.length();i++){
             char c = str.charAt(i);
             int index = str.indexOf(c, i + 1);
             if(index==-1){
                 sb1.append(c);
             }
        }
        System.out.println(sb1);

        //approach-3
         char[] chars = str.toCharArray();
         StringBuilder ab3=new StringBuilder();
         for(int i=0;i<chars.length;i++){
             boolean flag=false;
             for(int j=i+1;j<chars.length;j++){
                 if(chars[i]==chars[j]){
                     flag=true;
                 }
             }
             if(!flag){
                 ab3.append(chars[i]);
             }
         }
        System.out.println(ab3);

         //approach-4
         StringBuilder sb4=new StringBuilder();
        Set<Character> setval=new LinkedHashSet<>();
         for(int i=0;i<str.length();i++){
             setval.add(str.charAt(i));
         }
         for(char c:setval){
             sb4.append(c);
         }
        System.out.println(sb4);
    }
}
