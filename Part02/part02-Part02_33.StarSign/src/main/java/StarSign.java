
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        int five = 5;
        printStars(five);
       
        System.out.println("\n---");
        
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i =1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
        
    }   


    public static void printSquare(int size) {
        // second part of the exercise
        int num =1;
        while(num <= size){
            printStars(size);
            
            num++;
        }
    }
    public static void printRectangle(int width, int height) {
        int num = 1;
        while(num <= height){
            printStars(width);
            
            num++;
            
        }
    }
    public static void printTriangle(int size) {
        int num =1;
        while(num <= size){
            printStars(num);
           
            num++;
        }
    }
}

