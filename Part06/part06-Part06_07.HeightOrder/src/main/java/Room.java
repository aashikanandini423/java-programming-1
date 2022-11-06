
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
public class Room {
    private ArrayList<Person> listOfPerson;
    
    public Room(){
        this.listOfPerson = new ArrayList<>();
    }
    
    public void add (Person person){
        this.listOfPerson.add(person);
    }
    
    public boolean isEmpty(){
        if(this.listOfPerson.size() == 0){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.listOfPerson;
    }
    
    public Person shortest(){
        if(this.listOfPerson.isEmpty()){
            return null;
        }
        Person shortest = this.listOfPerson.get(0);
        
        for(Person p:this.listOfPerson){
            if(shortest.getHeight() > p.getHeight() ){
                shortest = p;
            }
            
        }
        return shortest;
    }
    
    public Person take(){
        if(this.listOfPerson.isEmpty()){
            return null;
        }
        Person taken  = this.shortest();
        this.listOfPerson.remove(this.shortest());
        
        return taken;
    }
    
    
}
