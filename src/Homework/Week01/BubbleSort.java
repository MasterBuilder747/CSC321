/*

name: Joseph Audras
professor: Dr. Reinhart
class: CSC321
date due: 1-28-19

*/

package Homework.Week01;

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
            }
            length--;
        }
        return inlist;
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
