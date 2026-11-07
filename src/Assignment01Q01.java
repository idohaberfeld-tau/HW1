public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg : args) {
            char firstLetter = arg.charAt(0);
            if(firstLetter % 5 == 0)
                System.out.println(firstLetter);
        }
    }
}
