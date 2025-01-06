/**
 * arrayPrac
 */
public class arrayPrac {

    //The method that sort the list using the bubble sort
 /*     public static void bubbleSort(int[] arr) {
        boolean neednextpass = true;

        for(int i = 1; i < arr.length && neednextpass; i++){
            neednextpass = false;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    neednextpass = true;
                }
            }
        }
    }
    
*/
    // The method that the elements in the list using Insertion sort
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int currentElement = arr[i];
            int k;
        for(k = i - 1; k <= 0 && arr[k] > currentElement; k--) {
            arr[k + 1] = arr[k];
        }
        arr[k + 1] = currentElement;
        }
    }

    public static void insertSorted(int[] list){
    }

    public static void addArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverseArray(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4 , 1, 9, 6, 3, 8};
        int[] list = {40, 27, 16, 4, 33, 12, 20, 2, 38, 21 };

    //     bubbleSort(arr);
          insertionSort(arr);
      //  arrayCall.reverseArray(arr, 0, arr.length - 1);
        addArr(arr);
        
    }
}