
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list =  new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.list.size() == 0){
            return true;
        }
        return false;
    }
    
    public void add (String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    public String take(){
       int topmostValue = this.list.size() - 1;
       String topInput = this.list.get(topmostValue);
       this.list.remove(topInput);
       return topInput;
       
    }
}
