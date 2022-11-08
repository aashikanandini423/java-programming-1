
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        BirdRegister register = new BirdRegister();

        UserInterface intface = new UserInterface(scan, register);

        intface.start();
        

    }

}
