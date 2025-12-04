package Activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] array = {4, 3, 2, 10, 12, 1, 5, 6};

        System.out.println("Original Array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }


    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;   
        }
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
