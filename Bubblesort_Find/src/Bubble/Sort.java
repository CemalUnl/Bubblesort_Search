/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble;

import java.util.Scanner;

public class Sort {

    public int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sort ss = new Sort();
        Scanner in = new Scanner(System.in);
        int arr[] = {2, 4, 6, 8, 10, 12};
        /*You can change  */
        System.out.println("Enter non-neg and even value");
        int x = in.nextInt();
        if ((x & 1) == 1) {
            arr[1] = x;
        } else {
            assert (x % 2 == 0) : "Only positives, try again.";
        }

        int result = ss.search(arr, x);
        System.out.println("Bubble sort :");
        ss.bubbleSort(arr);
        ss.printArray(arr);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }

    }

}
