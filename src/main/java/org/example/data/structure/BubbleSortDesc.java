package org.example.data.structure;

public class BubbleSortDesc {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55 ,1 ,-22};

        System.out.println("***Bubble Sort DESC***\n");

        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j-1]) {

                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}