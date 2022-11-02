
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int firstInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        int lastInput = Integer.valueOf(scanner.nextLine());
            
        int result = 0;
        int i  = firstInput;
        while (i <= lastInput){
            result = result + i;
            i++;
        }
        System.out.println("The sum is:"+result);
        
    }    
}       