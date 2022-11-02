
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 0){
                break;
            }else{
                sum = sum + userInput;
                number = number + 1;
            }
        }
        System.out.println("Average of the numbers: "+(sum/number));

    }
}
