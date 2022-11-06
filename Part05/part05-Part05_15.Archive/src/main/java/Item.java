/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String id,String name ){
        this.identifier = id;
        this.name = name;
    
    }
    @Override
    public String toString(){
        return this.identifier+": "+this.name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Item)){
            return false;
        }
        Item comparedItem = (Item) compared;
        
        return this.identifier.equals(comparedItem.identifier) ;
               
        
    }
    
    
}
