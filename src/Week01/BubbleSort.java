package Week01;

public class BubbleSort {

    public static int[] bubblesort(int[] inlist) {

        int[] out = new int[inlist.length];

        for (int i = 0; i < inlist.length; i++) {

            

        }

        return out;
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
