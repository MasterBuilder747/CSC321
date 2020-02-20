package Homework.Week05;

public class HW5Test {

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 2, 1};
        if (pal(a)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        int[] b = {1, 2, 3, 2, 1};
        if (pal(b)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean pal(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] != a[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
