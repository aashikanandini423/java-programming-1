
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
public class Hold {
    
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight ){
        
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int currentWeight = 0;
        for(Suitcase s: this.suitcases){
            currentWeight += s.totalWeight();
        }
        if((currentWeight + suitcase.totalWeight()) <=  this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        int currentWeight = 0;
        for(Suitcase s: this.suitcases){
            currentWeight += s.totalWeight();
        }
        return this.suitcases.size()+" suitcases("+currentWeight+" kg)";
    }
    
    public void printItems(){
        for(Suitcase s:this.suitcases){
            s.printItems();
        }
    }
    
    
    
}
