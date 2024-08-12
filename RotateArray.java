// Write a program to cyclically rotate an array by one

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rotated = rotateArrayByOne(new int[]{1, 2, 3, 4, 5, 6, 7});
        for(int x : rotated){
            System.out.print(x+" ");
        }
    }

    public static int[] rotateArrayByOne(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
        return arr;
    }
}
