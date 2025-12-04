package Activities;

public class Activity2 {
    public static void main(String[] args) {

        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sum = 0;

        for (int num : numbers) {
            if (num == 10) {
                sum += 10;
            }
        }

        boolean result = (sum == 30);

        System.out.println("Sum of all 10's: " + sum);
        System.out.println("Result: " + result);
    }
}
