package qno_6;

public class Repeating {

    public int power(int x,int n) {

        int base = x;
        int exponent = n;
        int result = 1;

        while(exponent != 0)
        {
            result *= base;
           --exponent;
        }
        return result;
    }
}