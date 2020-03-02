package Homework;

public class HW8 {

    //prime number implementation
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            //if there is any exact division (aka remainder == 0)
            //of any numbers starting with 2 until right before n,
            //it is not a prime number
            //otherwise, it is
            if (n % i == 0) { //somehow modulo needs to be implemented in assembly
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + prime(i));
        }
    }
}
