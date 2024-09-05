package org.example.data.structure;

public class SelectionSortDESC {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("***Selection Sort DESC ***\n");

        for (int i = 1; i < array.length; i++){

            int largest = i-1;
            boolean found = false;
            for (int j = i; j < array.length; j++) {

                if (array [j] > array [largest]) {
                    largest = j;
                    found = true;
                }
            }

            if (found) {
                int temp = array[i-1];
                array[i-1] = array[largest];
                array[largest] = temp;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}