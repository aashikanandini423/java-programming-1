
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negNumber = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            if( num < 0){
                negNumber = negNumber + 1;
            }
        }
        System.out.println("Number of negative numbers: "+negNumber);
    }
}
