
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = inputScanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.print(name);
                if(age == 1){
                    System.out.println(",age:"+age+" year");
                    
                }else if(age >1 || age<1){
                    System.out.println(",age:"+age+" years");
                }
                
            }
        }catch(Exception e) {
            System.out.println("File not read" );
        }


    }
}
