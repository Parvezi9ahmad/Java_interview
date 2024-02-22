public class RemoveWHiteSpaces {
    public static void main(String[] args) {
        String str="   j va is a pro gramm ing lan gua ge   ";
         String s = str.replaceAll("\\s", "");
        System.out.println(s);
    }
}
