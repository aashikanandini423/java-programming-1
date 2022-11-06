
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String printOutput = "The collection "+this.name;
        if(this.elements.size() == 0){
            return printOutput+" is empty.";
        }
        
        String itemOnList = "";
        for(String s:this.elements){
            itemOnList =  itemOnList+"\n"+s;
            
        }if(this.elements.size() == 1){
            return printOutput+" has "+this.elements.size()+" element:"+itemOnList;
        }
        return printOutput+" has "+this.elements.size()+" elements:"+ itemOnList;
        
    }
    
}
