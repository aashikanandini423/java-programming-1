
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] part = input.split(",");
            int age = Integer.valueOf(part[1]);
            if(age > oldest){
                oldest = age;
                name = part[0];
            }
            
        }    
        System.out.println("Name of the oldest:"+ name);    
                
        
        


    }
}
