package qno_7;

public class Parameterized {

    public int square(int n) {
        return n*n;
    }

    public int stringLength(String s) {
        if(s==null) {
            return -1;
        }
        int len = s.length();
        return len;
    }
}