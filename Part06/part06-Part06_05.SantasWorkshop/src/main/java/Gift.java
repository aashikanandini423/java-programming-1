/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Gift {
    private String giftName;
    private int weight;
    
    public Gift(String name,int weight){
        this.giftName = name;
        this.weight = weight;
    }   
    public String getName(){
        return this.giftName;
    }
    
    public int getWeight(){
        return this.weight;
    } 
    
    public String toString(){
        return this.getName()+"("+this.getWeight()+"kg)";
        
    }
    
    
    
}
