public class Calculator {
    public static int Add(String numbers) {
        int i, length, sum=0;
        if(!numbers.equals("")) {
            String[] input = numbers.split("[, | \n]", 0);
            length = input.length;
            for(i=0; i<length; i++) {
                sum += Integer.parseInt(input[i]);
            }
        }
        return sum;
    }
}