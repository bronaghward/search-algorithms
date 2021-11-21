// This class performs a binary search on a sorted array of values using a recursive method


public class BinarySearch
{
public static int binarySearch(int[] arr, int indexLeft, int indexRight, int targetNumber)
{

 
if (indexLeft<=indexRight){

int mid = (indexLeft + indexRight) / 2; 

// If target is found at mid, return mid 
if(targetNumber == arr[mid]){
return mid; 
}

// If target is below mid, then search the lower half of the array  
if(targetNumber<arr[mid]){ 
return binarySearch(arr, indexLeft, mid -1, targetNumber);     
}

// If target is above mid, then search the upper half of the array 
if(targetNumber>arr[mid]){
return binarySearch(arr, mid + 1, indexRight, targetNumber);     
}
}
return -1; 
}
 
public static void main(String[] args)
{
int[] arr = { 2, 5, 6, 8, 9, 10, 11, 12, 19, 25, 33, 45, 52 };
int target = 25;
 
int indexLeft = 0;
int indexRight = arr.length - 1;
 
int index = binarySearch(arr, indexLeft, indexRight, target);
  if (index != -1) {
  System.out.println("Element found at index " + index);
  } 
  else {
  System.out.println("Element not found in the array");
  }
}

}



