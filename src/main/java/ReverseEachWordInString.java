public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str="java code";
        String reverse="";
         String[] s = str.split(" ");
         for(String s1:s){
           String rev="";
           for(int i=s1.length()-1;i>=0;i--){
               rev=rev+s1.charAt(i);
           }
           reverse=reverse+rev+" ";
        }
        System.out.println(reverse);
    }
}
