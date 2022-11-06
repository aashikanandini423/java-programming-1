
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
public class Package {
    private ArrayList<Gift> giftList ;
    
    public Package(){
        this.giftList = new ArrayList<>();
    }   
    
    public void addGift(Gift gift){
        this.giftList.add(gift);
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Gift g:giftList){
            sum = sum + g.getWeight();
        }
        return sum;
    }
    
}
