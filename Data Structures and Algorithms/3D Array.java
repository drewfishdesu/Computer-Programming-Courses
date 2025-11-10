import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the 3D Array (x, y, z dimensions)");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[][][] array = new int[x][y][z];

        System.out.println("Enter " + (x * y * z) + " elements.");
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                for(int k = 0; k < z; k++) {
                    System.out.println("Element at [" + i + "][" + j + "][" + k + "]"); 
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("\nThe 3D array elements are:");
        for(int i = 0; i < x; i++) {
            System.out.println("\nLayer " + i + ":\n");
            for(int j = 0; j < y; j++) {
                for(int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " "); 
                }
                System.out.println();

            }
        }

        int max = array[0][0][0];
        int min = array[0][0][0];

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                for(int k = 0; k < z; k++) {
                    if(array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                    if(array [i][j][k] < min) {
                        min = array[i][j][k];
                    }
                }
            }
        }

        int totalDifference = Math.abs(max - min);
        System.out.println("\nTotal difference of all the elements: " + totalDifference);
        
        scanner.close();
    }
}