package CSC1009.wk02_lab;

import java.util.Scanner;

public class Week02 {
    public void wk02_question1(){
        double radius, area, Pi = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        
        area = Pi * Math.pow(radius, 2);
        System.out.println("The area for circle of radius "+ radius + " is " + area);
    }
    public void wk02_question2(){
        
        double[] num  = new double[3];
        String StrNum = "";
        double total = 0, average =0;
        int counter =0;
        
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        while (counter <num.length){
            StrNum = input.nextLine();
            String [] splited = StrNum.split("\\s");
            for (int i=0; i < splited.length ;i++){
                num[counter] = Double.parseDouble(splited[i]);
                counter ++;
            }
        }


        //Adding all the number together
        for (int i =0; i<num.length; i++){
            total += num[i];
        }

        //Calculating average and printing output
        average = total / num.length;

        System.out.println("The average of " + num[0] + " " + num[1] + " " + num[2] + " is " + average);
        

    }
    public void wk02_question3(){

        long totalMilliseconds = System.currentTimeMillis();
        //Getting Current Seconds
        long totalseconds = totalMilliseconds / 1000;
        long currentSeconds = totalseconds % 60;   
        //Getting Current Minutes
        long totalMinutes = totalseconds / 60;
        long currentMinutes = totalMinutes % 60;
        //Getting Current Hours
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.format("Current time is %d:%d:%d GMT \n",currentHours,currentMinutes,currentSeconds);

    }
    public void wk02_question4(){

        int year,zodiacYear;

        System.out.println("Enter a year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        //Finding chinese zodiac based of 12-year cycle
        zodiacYear = year % 12;
        switch(zodiacYear){
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            default:
                System.out.println("Error");
                break;
            
        }

    }

}
