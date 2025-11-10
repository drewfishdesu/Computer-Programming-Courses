public class InsertionSort
{
    public static void main(String[] args) {
		int[] numbers = {29, 10, 14, 37, 16, 5, 25, 41, 18, 3};

        System.out.println("Original array: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("Insertion sorted array: ");
        printArray(numbers);
	}

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i ++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}