/* This class performs a selection sort algorithm on an array of values */ 

import java.util.Arrays;

public class SelectionSort {


public static void sort(int[] numbers){
int length = numbers.length;     

// Set the index position (x) to begin at 0 
// Loop through each index position in the array - do this until the penultimate position (length of array minus 1)
for(int x = 0; x < length - 1; x++){
int indexPosition = x; 

// If the next position along (y = x + 1) has a value that is smaller, then make y the index position 
    for(int y = x+1; y < length; y++){
         if(numbers[y]< numbers[indexPosition]){
         indexPosition = y;        
         }    
    }

// Swap value at x for value at the index position     
swap(numbers, x, indexPosition);  

}
}

public static void swap(int[] values, int value1, int value2){
int temp = values[value2]; 
values[value2] = values[value1]; 
values[value1] = temp; 
}



public static void main(String[] args) {
int[] inputValues = {3,7,2,9,1,4}; 
SelectionSort.sort(inputValues);
System.out.println("Your values are now in ascending order: " + Arrays.toString(inputValues));   
}  
}  


