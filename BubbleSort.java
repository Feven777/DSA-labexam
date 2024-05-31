package Question;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        char[] alphabets = {'d', 'a', 'c', 'b', 'f', 'e'};
        System.out.println("Original Alphabets: " + Arrays.toString(alphabets));
        bubbleSort(alphabets);
        System.out.println("Sorted Alphabets: " + Arrays.toString(alphabets));
    }
}


