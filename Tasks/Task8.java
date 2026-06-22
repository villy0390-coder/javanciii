package Tasks;

public class Task8 {

    public static void main(String[] args) {

        int result = computeSum(4, 5, 10);

        System.out.println("Total Sum: " + result);

    }

    public static int computeSum(int... numbers) {

        int total = 0;

        for (int number : numbers) {

            int cumulativeSum = 0;

            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }

            System.out.println(number + " = " + cumulativeSum);

            total += cumulativeSum;
        }

        return total;
    }

}