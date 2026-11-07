public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int num = Integer.parseInt(args[0]);
        double sum = 0;
        for (int i = 0; i < num; i++) {
            double addition = 1.0/(2*i + 1);
            double amountToAdd = (i % 2 == 0) ? addition : -addition;
            sum += amountToAdd;
        }
        approxPi = 4 * sum;
        System.out.println(approxPi + " " + actualPi);
    }
}
