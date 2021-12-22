public class whileSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is " +SumDigits(125));
        System.out.println("The sum of the digits is " +SumDigits(15));
        System.out.println("The sum of the digits is " +SumDigits(995));
    }

    public static int SumDigits(int number) {

        if(number <= 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }
}
