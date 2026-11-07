public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int previous2 = 1;
        int previous1 = 0;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            int current = previous1 + previous2;
            System.out.print(current);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            if (current % 2 == 1)
                numOdd++;
            previous2 = previous1;
            previous1 = current;
        }
        System.out.println();      
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
