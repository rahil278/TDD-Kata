public class Calculator {
    public static int Add(String numbers) {
        int sum;
        if(!numbers.equals("")) {
            sum = Integer.parseInt(numbers);
        }
        else {
            sum = 0;
        }
        return sum;
    }
}
