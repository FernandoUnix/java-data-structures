package org.example.data.structure;

public class ShellSortAsc {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("***Shell Sort DESC ***\n");

        for (int gap = array.length / 2; gap > 0 ; gap /= 2) {

            System.out.println("gap: " + gap);

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while(j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j-gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }

//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
    }
}