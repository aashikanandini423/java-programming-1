/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashi
 */
public class Books {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Books(String title,int pages,int publicationYear){
        this.pages = pages;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return this.title+", "+this.pages+" pages, "+this.publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }           
    
}
