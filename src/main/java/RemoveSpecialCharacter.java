public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str = "parvez@123";
        String s = str.replaceAll("[^a-zA-Z-0-9]", "");
        System.out.println(s);
    }
}
