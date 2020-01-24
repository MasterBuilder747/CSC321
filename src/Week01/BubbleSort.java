package Week01;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubblesort(int[] inlist) {

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
            //print(inlist);
            length--;
        }

        return inlist;

        /*
        figure out the loop structure to allow for it to decrease in the amount of increments each time

        desired output:
        1 1 1 1
        1 1 1
        1 1
        1

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

    //for debugging
    public static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static void main (String[] args) {
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
    }

}
