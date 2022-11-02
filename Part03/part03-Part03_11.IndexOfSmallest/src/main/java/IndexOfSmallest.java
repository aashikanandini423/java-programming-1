
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList(); 
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 9999){
                break;
            }
            list.add(userInput);
        }
       
         int smallest = list.get(0);
         
        for(int i=0 ;i<list.size();i++){
           int number = list.get(i);
            if(smallest > number){
                smallest = number;
                
                 
            }
        }   
        System.out.println("Smallest number: "+smallest);
        
        for(int j=0 ;j<list.size();j++){
            if(list.get(j) == smallest){
                System.out.println("Found at index:"+j);
            }
        }
               
        
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
