import java.util.*;
// Driver Class
class btodconversion{
    public static void StringBinaryToDecimal(String s)
    {
        int ans = 0, i, p = 0;

        // length of String
        int len = s.length();

        // Traversing the String
        for (i = len - 1; i >= 0; i--) {

            if (s.charAt(i) == '1') {
                // Calculating Decimal Number
                ans += Math.pow(2, p);
            }
            // incrementing value of p
            p++;
        }
        System.out.println("Decimal Equivalent of " + s
                + " is " + ans);
    }

    public static void IntegerBinaryToDecimal(int num)
    {
        int ans = 0, rem = 0, temp = num;
        int i = 0;
        while (num != 0) {

            // remainder when num is
            // divided by 10
            rem = num % 10;

            // quotient
            num /= 10;

            // Calculating decimal number
            ans += rem * Math.pow(2, i);

            i++;
        }

        System.out.println("Decimal Equivalent of " + temp
                + " is " + ans);
    }

    // main function
    public static void main(String[] args)
    {
        int num = 1010;
        String s = "1100";

        IntegerBinaryToDecimal(num);
        StringBinaryToDecimal(s);
    }
}