
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its content printed?");
        String userInput =  scanner.nextLine();
        
          try (Scanner scanner1 = new Scanner(Paths.get(userInput))) {

    
            while (true) {
        
                String row = scanner1.nextLine();
        
                System.out.println(row);
            }
            }catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
            }
        
            
        
    }    
    
}
