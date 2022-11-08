
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class JokeManager {
    private ArrayList<String> jokeList;
    
    public JokeManager(){
        
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        
        
        this.jokeList.add(joke);
        
    }
    
    public String drawJoke(){
        String randomJoke = "";
        if(this.jokeList.isEmpty()){
            return "Jokes are in short supply.";
        }else{
            Random rand = new Random();
            randomJoke = this.jokeList.get(rand.nextInt(this.jokeList.size()));
        }
        return randomJoke;
    }
    
    public void printJokes(){
        
        for(String s:this.jokeList){
            System.out.println(s);
        }
        
        
    }
    
    
}
