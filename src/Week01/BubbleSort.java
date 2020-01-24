package Week01;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubblesort(int[] inlist) {

        int[] out = new int[inlist.length];
        int length = inlist.length-1;

        while (length >= 1) {
            for (int i = 0; i < length; i++) {
                if (inlist[i] > inlist[i + 1]) {
                    int swap = inlist[i];
                    inlist[i] = inlist[i + 1];
                    inlist[i + 1] = swap;
                }
            }
            length--;
        }

        return out;

        /*
        int length = 5-1;
        while (length >= 0) {
            for (int i = 0; i < length; i++) {
                System.out.print("1 ");
            }
            System.out.println();
            length--;
        }
        */
    }

    public static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static void main (String[] args) {

        int[] inlist = {-2, 3, 7, 0, 4, 3, -1, 8, 5, 5, 5};

        int length = inlist.length-1;

        while (length >= 1) {
            for (int i = 0; i < length; i++) {
                if (inlist[i] > inlist[i + 1]) {
                    int swap = inlist[i];
                    inlist[i] = inlist[i + 1];
                    inlist[i + 1] = swap;
                }
                //print(inlist);
            }
        print(inlist);
            length--;
        }

        /*
        int[] sorted = {-2, 3, 7, 0, 4, 3, -1, 8, 5, 5, 5};
        for (int i : sorted) {
            System.out.print(i + ", ");
        }
        System.out.println();
        sorted = bubblesort(sorted);
        for (int i : sorted) {
            System.out.print(i + ", ");
        }
        System.out.println();

         */
    }

}
