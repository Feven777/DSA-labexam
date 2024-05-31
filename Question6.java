package Question;

public class Question6 {

    public static void deleteElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            System.out.println("Array after deletion:");
            printArray(newArray);
        } else {
            System.out.println("Invalid index");
            System.out.println("Original array:");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexToDelete = 2;

        System.out.println("Original array:");
        printArray(array);

        deleteElement(array, indexToDelete);
    }
}




