package Day_01;
import java.util.*;

class Sqr {
   
    public static int Square(int n){
        // handle negative numbers
        if (n < 0) {
            n = -n;
        }

        int res = n;

        // add n to res, n-1 times
        for (int i = 1; i < n; i++) {
            res += n;
        }
        return res; // ✅ return after loop completes
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("n = " + n + ", n^2 = " + Square(n));
    }
}
