public class InsertionSortDemo {
    public static void insertionSort(int[] arr) {
        System.out.println("Initial Array:");
        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;

            while (j >= 0 && currentElement < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Step " + i + ": Moved " + arr[j + 1] + " to position " + (j + 2));
                System.out.println("Current Array State:");
                printArray(arr);
            }
            arr[j + 1] = currentElement;
            System.out.println("Step " + i + ": Inserted " + currentElement + " at position " + (j + 1));
            System.out.println("Array after insertion:");
            printArray(arr);
            System.out.println("-");
        }

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myList = {2, 9, 5, 4, 8, 1, 6};
        insertionSort(myList);
    }
}