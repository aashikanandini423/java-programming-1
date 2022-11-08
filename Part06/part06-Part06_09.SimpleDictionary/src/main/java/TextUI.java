
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class TextUI {
    
    private Scanner s;
    private SimpleDictionary sd;
    
    public TextUI(Scanner s,SimpleDictionary sd){
        this.s = s;
        this.sd = sd;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = s.nextLine();

            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;

            }else{
                
                if(input.equals("add")){
                    System.out.println("Word:");
                    String wordInput = s.nextLine();
                    System.out.println("Translation:");
                    String translation = s.nextLine();
                    sd.add(wordInput, translation);
                }else{
                    if(input.equals("search")){
                        System.out.println("To be translated:");
                        String transInput = s.nextLine();
                        if(sd.translate(transInput)!= null){
                            System.out.println("Translation:"+sd.translate(transInput));
                        }else{
                            System.out.println("Word "+transInput+" was not found");
                        }
                        
                        
                    }else{
                        System.out.println("Unknown command");
                    }
                }   
                
            }
        }
    }
    
    
}
