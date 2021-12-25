public class Calculator {
    public static int Add(String numbers) {
        int sum, num1, num2;
        if(!numbers.equals("")) {
            String[] input = numbers.split("[,]", 0);
            if(input.length > 1) {
                num1 = Integer.parseInt(input[0]);
                num2 = Integer.parseInt(input[1]);
                sum = num1 + num2;
            }
            else {
                sum = Integer.parseInt(input[0]);
            }
        }
        else {
            sum = 0;
        }
        return sum;
    }
}