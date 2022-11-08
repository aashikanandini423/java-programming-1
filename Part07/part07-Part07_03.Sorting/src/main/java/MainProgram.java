

import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        
        System.out.println(Arrays.toString(numbers));
        MainProgram.exchangeSort(numbers);
        
        System.out.println(Arrays.toString(numbers));

        

       
        
           

    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 0;i < array.length;i++){
            if(smallest > array[i]){
                smallest = array[i];
                
                
            }
            
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array ){
        int smallest = array[0];
        int index = 0;
        for(int i = 0;i < array.length;i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
            
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        
        int smallIndex = startIndex;
            for(int j = startIndex+1; j < array.length; j++ ){
                if(array[smallIndex] > array[j]){
                    smallIndex = j;
                }
            }
            
        
        return smallIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        
        int temp = array[index1];
        
        array[index1] = array[index2];
        array[index2] =  temp;
        
        
    }
    
    public static void sort(int[] array){
        
        for(int i = 0;i < array.length;i++){
            int smallIndex = indexOfSmallestFrom(array, i);
            
            swap(array, i, smallIndex);
        
        }
        
    }
    public static void selectionSort(int[] array){
        
        for(int i = 0;i < array.length;i++){
            int smallIndex = i;
            for(int j = i+1; j < array.length; j++ ){
                if(array[smallIndex] > array[j]){
                    smallIndex = j;
                }
            }
            
            swap(array, i, smallIndex);
        
        }
        
    }
    
    public static void bubbleSort(int[] array) {
        for(int i = 0;i < array.length;i++) {
            for(int j = 0;j < array.length - i -1;j++){
                if(array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;	
                }
            }
        }
		
    }
    
    public static void exchangeSort(int[] array){
        for(int i = 0;i<array.length;i++) {
            for(int j = i+1;j < array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                }
            }
            
    }
        
    }
    
    
}
