
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
    private Scanner s;
    private TodoList t;
    
    
    
    public UserInterface(TodoList list,Scanner s){
        this.s = s;
        this.t = list;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String inp = s.nextLine();
            if(inp.equals("add")){
                this.add();
            }else if (inp.equals("remove")){
                this.remove();
            }else if(inp.equals("list")){
                this.list();
            }else if(inp.equals("stop")){
                break;
            }
            
        }
    }
    
    public void add(){
        System.out.println("To add:");
        String userInp = s.nextLine();
        t.add(userInp);
        
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(s.nextLine());
        t.remove(number);
        
    }
    
    public void list(){
        t.print();
    }
}
