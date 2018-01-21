public class Factorial {

    public static void main(String[] args) {

        int number = 5;

        System.out.println(number + "! = " + factorialIterative(number));
        System.out.println(number + "! = " + factorialRecursive(number));
    }

    /* FACTORIAL (iterative) */
    public static int factorialIterative(int number) {
        int result = number;
        for (int i = number; i > 1; i--) {
            result = result * (i - 1);
        }
        return result;
    }

    /* FACTORIAL (recursive) */
    public static int factorialRecursive(int number) {
        if (number == 1) {
            return number;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }
}