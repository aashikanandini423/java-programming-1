
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
public class UserInterface {
    private JokeManager joke;
    private Scanner scan;
    
    public UserInterface(JokeManager joke,Scanner scan ){
        
        this.joke = joke;
        this.scan = scan;
    }
    
    public void start(){
        
        
        
        while(true){
            System.out.println("Commands:\n" + "1 - add a joke\n" + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop");
            String userInput = scan.nextLine();
            if(userInput.equals("X")){
                break;
            }
            if(userInput.equals("1")){
                System.out.println("Write the joke to be added:");
                String newJoke = scan.nextLine();
                this.joke.addJoke(newJoke);
                
            }
            if(userInput.equals("2")){
                System.out.println(this.joke.drawJoke());
                
            }
            if(userInput.equals("3")){
                this.joke.printJokes();
            }
            
            
        }
    }
}
