package CSC1009.wk01_lab;

import java.util.Scanner;

public class Week01 {
    
    public void wk01_question2a(){
        System.out.println("Hello, I am Aaron!");
    }

    public void wk01_question2b(){        
        String StrMod;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        StrMod = input.nextLine();

        switch(StrMod){
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;

            case "CSC1007":
                System.out.println("Operating Systems");
                break;

            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;

            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;

            case "CSC1010":
                System.out.println("Computer Networks");
                break;


            default:
                System.out.println("Error");
                break;
        }
    }

    public void wk01_question2c(){
        for ( int x = 102; x > 66; x--){
            if ( x % 2 != 0){
                System.out.println("Value of x: "+ x);
            }
        }
    }
}
