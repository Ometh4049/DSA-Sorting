public class InsertionSortTest {
    
    public static void main(String[] args) {
        int[] array1 = {7, 2, 40, 12, 8};
        int[] array2 = {7, 2, 40, 12, 8};
        
        
        InsertionSort sorter = new InsertionSort();
        System.out.println("Original Array (Swap Method):");
        printArray(array1);
        
        
        sorter.insertionSort(array1);
        System.out.println("Sorted Array in Ascending Order (Swap Method):");
        printArray(array1);
        
        
        sorter.insertionSortDescending(array1);
        System.out.println("Sorted Array in Descending Order (Swap Method):");
        printArray(array1);

        
        InsertionSortOP optimizedSorter = new InsertionSortOP();
        System.out.println("\nOriginal Array (Optimized Method):");
        printArray(array2);
        
        
        optimizedSorter.insertionSortOptimized(array2);
        System.out.println("Sorted Array in Ascending Order (Optimized Method):");
        printArray(array2);
        
        
        optimizedSorter.insertionSortOptimizedDescending(array2);
        System.out.println("Sorted Array in Descending Order (Optimized Method):");
        printArray(array2);
    }

    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}