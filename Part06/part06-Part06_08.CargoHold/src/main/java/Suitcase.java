
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
public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight =  maxWeight;
    }
    
    public int totalWeight(){
        int total = 0;
        for(Item item:this.suitcase){
            total += item.getWeight();
        }
        return total;
    }
   
    public void addItem(Item item){
        
        if((this.totalWeight()+item.getWeight()) <= this.maxWeight){
            this.suitcase.add(item);
        }
        
        
    }
    
    
    public String toString(){
        
       if(this.suitcase.isEmpty()){
            return "no items(0 kg)";
       }
       if(this.suitcase.size() == 1){
            return this.suitcase.size() + " item (" +  this.totalWeight()+" kg)"; 
       }
       return this.suitcase.size() + " items (" +  this.totalWeight()+" kg)";
    }
    
    public void printItems(){
        
        for(Item i :this.suitcase){
            System.out.println(i);
        }    
    }
    
    public Item heaviestItem(){
        
        if(this.suitcase.isEmpty()){
            return null;
        }
        Item heaviest = this.suitcase.get(0);
        
        for(Item i :this.suitcase){
            if(heaviest.getWeight() < i.getWeight()){
                heaviest = i;
            }
        }
            return heaviest;
        
            
    }
        
    
       
    
}

