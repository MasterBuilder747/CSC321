/*
Name: Joseph Audras
Professor: Dr. Reinhart
Date due: 3-5-20
Class: CSC 321-1
*/

package Homework;

public class HW8PrimeAssembly {

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            //if there is any exact division (aka remainder == 0)
            //of any numbers starting with 2 until right before n,
            //it is not a prime number
            //otherwise, it is
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (prime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}
