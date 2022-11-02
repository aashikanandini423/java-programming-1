
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scanner.nextLine());
        int result = 1;
        int i = 1;
        while (i <= userInput){
            result = result*i;
            i++;
        }
        System.out.println("Factorial:"+result);
    }
}
