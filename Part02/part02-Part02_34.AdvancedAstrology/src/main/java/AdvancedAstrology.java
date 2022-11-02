
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i =1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=1;i <=number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int num=1;
        while(num<=size){
            printSpaces(size-num);
            printStars(num);
            
            num++;
            
        }
    }
    public static void christmasTree(int height){
        int finalNum = (1+(height - 1)*2);
        
        int num = 1;
        while(num <= finalNum){
            int spaceNum = (finalNum-num)/2;
            printSpaces(spaceNum);
            printStars(num);
            
            
            num =num+2;
        }
        for( int i =1 ; i<=2; i++){
            printSpaces(finalNum/2 - 1);
            printStars(3);
            
        }             
    }    
         
    

    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(20);
        
    }
}
