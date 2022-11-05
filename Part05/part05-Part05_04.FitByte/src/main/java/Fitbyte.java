/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Fitbyte {
    private int age;
    private  int restingHeartRate;
    
    public Fitbyte(int age , int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxHeartRate = 206.3 - (0.711 * this.age);
        double targetHeartRatePercentage = percentageOfMaximum; 
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * (targetHeartRatePercentage) + this.restingHeartRate;
        return targetHeartRate;
    }
    
}
