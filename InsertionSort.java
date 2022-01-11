
import java.util.Arrays;

public class InsertionSort {


public static void sort(int[] array){

// Loop through all index positions to the right, starting at index 1 
for(int right = 1; right < array.length; right++){ 

// Set current to be the value at right's index      
int current = array[right]; 

// Set left to be the index of right minus one 
int left = right - 1; 

// While left's index is >=0 and the value at left's index is greater than the current on the right 
// Shift the left index value to the right 
// Decrease the index of left by one 
    while(left >= 0 && array[left]> current) {
    array[left +1] = array[left]; 
    left --; 
    }

// Make the current value go in index position of left     
array[left + 1] = current; 

}


}

public static void main(String[] args) {
int[] unsortedValues = {40, 1, 45, 4, 30}; 
sort(unsortedValues); 
System.out.println("Your values are now sorted in ascending order: "); 
System.out.println(Arrays.toString(unsortedValues)); 

}    
    
}

