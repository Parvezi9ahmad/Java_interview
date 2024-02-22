public class ReplaceCharacterWithOccurance {
    public static void main(String[] args) {
        String input="opentest";
        char removechar='t';
        int cons=1;
        if(input.indexOf(removechar)!=-1) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == removechar) {
                    input = input.replaceFirst(String.valueOf(removechar), String.valueOf(cons));
                    cons++;
                }
            }
            System.out.println(input);
        }
        else{
            System.out.println("valoe os");
        }
    }
}
