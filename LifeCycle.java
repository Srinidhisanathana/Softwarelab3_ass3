package qno_5;

public class LifeCycle {

    public int[] array;
    public int n;

    public int arraySum(){
        int sum = 0;
        int n = array.length;

        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    };

    public boolean isPrime() {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}