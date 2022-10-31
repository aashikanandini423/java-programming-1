
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        double amount = Double.valueOf(scan.nextLine());
        if(amount < 5000){
            System.out.println("No tax!");
        }else if(amount >= 5000 && amount < 25000){
            double tax = 100 + (amount - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        }else if(amount >= 25000 && amount < 55000){
            double tax = 1700 + (amount - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        }else if(amount >= 55000 && amount < 200000){
            double tax = 4700 + (amount - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        }else if(amount >= 200000 && amount < 1000000){
            double tax = 22100 + (amount - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        }else {
            double tax = 142100 + (amount - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        }


    }
}
