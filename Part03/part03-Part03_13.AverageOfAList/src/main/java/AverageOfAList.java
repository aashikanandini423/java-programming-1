
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
        list.add(input);
        }
        double sum = 0;
        for(int i =0; i< list.size();i++){
            sum = sum + list.get(i);
        }
        System.out.println("Average: "+  sum/list.size());
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
