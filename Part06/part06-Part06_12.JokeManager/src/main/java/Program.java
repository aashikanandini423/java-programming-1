

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        JokeManager j = new JokeManager();
        Scanner scan = new Scanner(System.in);

        UserInterface u = new UserInterface(j, scan);
        u.start();
    }
}
