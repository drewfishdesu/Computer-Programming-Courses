public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {1, 67, 43, 26, 85, 3, 17, 53, 54, 72, 5};
        
        System.out.println("Original array:");
        printArray(numbers);
        
        selectionSort(numbers);
        
        System.out.println("Selection sorted array:");
        printArray(numbers);
    }
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
        
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}