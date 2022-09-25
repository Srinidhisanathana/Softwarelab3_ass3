package qno_3;

public class Assertions {

    public int[] initializeArray (int n) {

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        return array;
    }

    public boolean isPalindrome (String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i))
                return false;
        }
        return true;
    }
}