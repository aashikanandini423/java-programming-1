
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String input = scanner.nextLine();
        System.out.println("enter password:");
        String input1 = scanner.nextLine();
        if(input.equals("alex")&&input1.equals("sunshine") || input.equals("emma")&&input1.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
