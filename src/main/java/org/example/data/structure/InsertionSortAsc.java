package org.example.data.structure;

public class InsertionSortAsc {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55 ,1 ,-22};

        System.out.println("***Insertion Sort ASC***\n");

        for (int firstUnssortedIndex=1; firstUnssortedIndex < intArray.length; firstUnssortedIndex++)
        {
            int newElement = intArray[firstUnssortedIndex];

            int i;

            for (i  = firstUnssortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
