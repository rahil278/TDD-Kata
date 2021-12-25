public class Calculator {
    public static int Add(String numbers) throws Exception{
        int i, length, strLen, num, negative=0, sum=0;
        char delimeter = ',';
        String strNegative = "negatives not allowed ";
        strLen = numbers.length();
        if(strLen > 0) {
            if((strLen > 2) && (numbers.substring(0, 2).equals("//"))) {
                delimeter = numbers.charAt(2);
                numbers = numbers.substring(4, numbers.length());
            }
            String[] input = numbers.split("[" + delimeter + " | \n]", 0);
            length = input.length;
            for(i=0; i<length; i++) {
                num = Integer.parseInt(input[i]);
                if (num < 0) {
                    negative = 1;
                    strNegative += input[i] + ", ";
                }
                if(negative == 0) {
                    sum += Integer.parseInt(input[i]);
                }
            }
            if(negative == 1) {
                throw new Exception(strNegative.substring(0, strNegative.length()-2));
            }
        }
        return sum;
    }
}