public class Calculator {
    public static int Add(String numbers) {
        int i, length, strLen, sum=0;
        char delimeter = ',';
        strLen = numbers.length();
        if(strLen > 0) {
            if((strLen > 2) && (numbers.substring(0, 2).equals("//"))) {
                delimeter = numbers.charAt(2);
                numbers = numbers.substring(4, numbers.length());
            }
            String[] input = numbers.split("[" + delimeter + " | \n]", 0);
            length = input.length;
            for(i=0; i<length; i++) {
                sum += Integer.parseInt(input[i]);
            }
        }
        return sum;
    }
}