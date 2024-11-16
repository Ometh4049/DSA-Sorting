
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pooja
 */
public class SelectionSort {
    
   
    public static void main(String[] args) {
        int[] arr1 = {54, 28, 64, 22, 11 ,8};
        
        System.out.println("Original Array is : " + Arrays.toString(arr1) );
        
        for(int i=0;i<arr1.length;i++){
            int min_index = i;
                for(int j=i+1 ; j<arr1.length ; j++){
                    if(arr1[j] < arr1[min_index]){
                        min_index = j;
                    }
                }
                int temp = arr1[i];
                arr1[i] = arr1[min_index];
                arr1[min_index] = temp;
        }
        System.out.println("\nSorted Array in Ascending Order : " + Arrays.toString(arr1));
        
        int[] arr2 = {54, 28, 64, 22, 11 ,8};
        
        for (int i = 0; i < arr2.length; i++) {
            int max_index = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] > arr2[max_index]) { // change comparison to >
                    max_index = j;
                }
            }
            int temp = arr2[i];
            arr2[i] = arr2[max_index];
            arr2[max_index] = temp;
        }
        System.out.println("\nSorted Array in Descending Order is : " + Arrays.toString(arr2));
    }
}
