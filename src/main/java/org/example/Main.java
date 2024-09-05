package org.example;

public class Main {

    public static void main(String[] args) {
        int[] array = {9,3,-8,50,7,5,-90,99};

        for(int lastIndex = array.length - 1; lastIndex > 0 ; lastIndex--) {
            System.out.println("last index: " + lastIndex);

            for (int i = 0; i < lastIndex; i++) {

                if (array[i] > array[i + 1]) {
                    int index = array[i+1];
                    array[i+1] = array[i];
                    array[i] = index;
                }
            }
        }

        for(int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}