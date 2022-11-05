/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Timer {
    private int hundredthOfSeconds;
    private int seconds;
    
    public Timer(){
        
        this.hundredthOfSeconds = 0;
        this.seconds = 0;
        
        
    }
    public String toString(){
        String sec = String.valueOf(this.seconds);
        String hs = String.valueOf(this.hundredthOfSeconds);
        
        if(this.seconds < 10 ){
             sec = "0" + this.seconds;
            
        }
        if(this.hundredthOfSeconds < 10){
            hs = "0" + this.hundredthOfSeconds;
        }
        
        return sec + ":" + hs;
    }
    public void advance(){
        this.hundredthOfSeconds = this.hundredthOfSeconds + 1;
        if(this.hundredthOfSeconds >= 100){
            this.hundredthOfSeconds = 0;
            this.seconds = this.seconds + 1;
            
        }
        if(this.seconds >= 60){
            this.seconds = 0;
        }
    }
    
}
