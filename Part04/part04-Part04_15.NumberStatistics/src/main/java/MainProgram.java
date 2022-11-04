
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics statistics = new Statistics();
        Statistics statisEven = new Statistics();
        Statistics statisOdd = new Statistics();
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
            statistics.addNumber(userInput);
            if(userInput % 2 == 0){
                statisEven.addNumber(userInput);
            }else{
               
                statisOdd.addNumber(userInput);
            }    
        }
        
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + statisEven.sum());
        System.out.println("Sum of odd numbers: " + statisOdd.sum());
        
    }
}
