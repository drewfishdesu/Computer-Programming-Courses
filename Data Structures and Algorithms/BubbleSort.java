public class BubbleSort
{
    public static void main(String[] args) {
        int[] numbers = {34, 12, 45, 2, 18, 56, 9, 27, 4, 31};

        System.out.println("Original array: ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Bubble sorted array: ");
        printArray(numbers); 
		
	}

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}