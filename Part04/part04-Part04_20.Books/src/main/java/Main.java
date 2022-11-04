import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();
        
        while(true){
        
            System.out.println("Title: ");
            String title =  scanner.nextLine();
            if(title.isEmpty()){
             break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int pbYear = Integer.valueOf(scanner.nextLine());
            
            book.add(new Books(title,pages,pbYear));
        } 
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        for(Books b:book){
            if(info.equals("everything")){
                System.out.println(b);
            }else if(info.equals("name")){
                System.out.println(b.getTitle());
            }    
             
        
                    
            
        }    
            
    }        
}           
        
        

    

