
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last Number?");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int result = 0 ;
        int i = 0;
        while(i <= userInput){
            result = result + i;
            i++;
        }
        System.out.println(result);

    }   
}
