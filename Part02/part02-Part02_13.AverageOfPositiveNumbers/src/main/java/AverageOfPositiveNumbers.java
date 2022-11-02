
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumberCount = 0;
        double sum = 0;
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine()); 
            if(userInput == 0 ){
                if(positiveNumberCount == 0 ){
                    System.out.println("Cannot calculate the average");
                }else{
                    System.out.println(sum/positiveNumberCount);
                }
                break;
            }
            if( userInput > 0){
                sum = sum+userInput;
                positiveNumberCount = positiveNumberCount+1;
            }
        }
           
    }
}
