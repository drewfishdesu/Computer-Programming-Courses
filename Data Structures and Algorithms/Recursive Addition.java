import java.util.Scanner;

public class addArray {

    public static int sumRange(int start, int end) {
        if(start > end) {
            return 0; // base case
        } else {
            return start + sumRange(start + 1, end); // recursive call
        }
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.println("Enter the end of the range: ");
        int end = scanner.nextInt();

        if(start > end) { // error catching
            System.out.println("Start should be less than or equal to end.");
        } else {
            int sum = sumRange(start, end);
            System.out.println("\nSum of numbers from " + start + " to " + end + " is " + sum);
        }
        scanner.close(); // shuts down the scanner
    }
}