
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String input1 = scanner.nextLine();
        for(int i=0; i<list.size();i++){
            if(list.contains(input1)){
                System.out.println(input1+" was found!");
                break;
            }else{
                System.out.println(input1+" was not found!");
                break;
            }   
            
            
        }
        
    }
}
