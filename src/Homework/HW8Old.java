package Homework;

public class HW8Old {

    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean prime(int a) {
        if (a < 2) {
            return false;
        } else {
            double b = a;
            for (int i = 0; i < a; i++) {
                //a / (b + i)
            }
        }
        return true;
    }

    //prime number implementation
    public static void main(String[] args) {
        System.out.println(prime(1));

        int a = 3;
        int b = 1;
        double r = a / (b * 1.0);
        double r2 = r - (int)r;
        System.out.println(r2);
    }

}
