/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
import java.util.ArrayList;

public class BirdRegister {
     private ArrayList<Bird> register;

    public BirdRegister() {
        this.register = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        register.add(new Bird(name, latinName));
    }

    public ArrayList<Bird> getRegister() {
        return register;
    }

}
