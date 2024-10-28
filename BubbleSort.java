import java.util.Scanner;

public class BubbleSort {
    // Method to implement bubble sort in descending order
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Modify the comparison to sort in descending order
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1] without using a separate method
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        // Ask the user to enter 8 numbers using a different approach
        int count = 1;
        while (count <= 8) {
            System.out.print("Enter your number " + count + ": ");
            numbers[count - 1] = scanner.nextInt();
            count++;
        }

        // Sort the array in descending order
        bubbleSort(numbers);

        // Print the sorted array
        System.out.println("Sorted array in Descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
