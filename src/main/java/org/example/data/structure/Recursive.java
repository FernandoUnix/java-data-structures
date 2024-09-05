package org.example.data.structure;

public class Recursive {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
    }

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}