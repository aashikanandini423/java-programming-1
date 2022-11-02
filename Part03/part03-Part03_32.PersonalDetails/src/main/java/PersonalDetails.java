
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = ""; 
        int maxLength = 0;
        int sum = 0;
        int count = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] part = input.split(",");
            String name = part[0];
            int length = name.length();
            if(length > maxLength){
                maxLength = length;
                longestName = part[0];
                
            }
            int birthYear = Integer.valueOf(part[1]);
            sum = sum + birthYear;
            count++;
        }   
        System.out.println("Longest name:"+longestName);
        System.out.println("Average of the birth years:"+(1.0*sum)/count);
    }        
        
}        


    

