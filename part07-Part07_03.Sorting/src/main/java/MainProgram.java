import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);
    }

    public static int smallest(int[] array) {
        int smallestInt = array[0];
        for (int num : array) {
            if (smallestInt > num) {
                smallestInt = num;
            }
        }

        return smallestInt;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int originalIndex1Value = array[index1];
        array[index1] = array[index2];
        array[index2] = originalIndex1Value;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
