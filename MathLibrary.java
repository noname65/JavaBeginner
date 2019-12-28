package mathlibrary;

import java.util.Scanner;
import java.text.DecimalFormat;
public class MathLibrary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int User_Choice;
        while(false!=true){
            System.out.print("Choose what you want to use:\nA. To calculate what day of the week it is after so many days have passed.\nB. To calculate the circumference of a circle.\nC. To calculate how much money in interest you earn based on a given investment after a certain period of time.\nEnter your choice:");
            String UserChoice=s.nextLine();
            if("a".equals(UserChoice.toLowerCase().trim())){
                User_Choice=1;
                break;
            }else if("b".equals(UserChoice.toLowerCase().trim())){
                User_Choice=2;
                break;
            }else if("c".equals(UserChoice.toLowerCase().trim())){
                User_Choice=3;
                break;
            }else{
                System.out.println("Please re-enter");
            }
        }
        if(User_Choice==1){
            day_of_the_week();
        }else if(User_Choice==2){
            the_circumference_of_a_circle();
        }else if(User_Choice==3){
            investment();
        }
    }
    public static void day_of_the_week() {
        Scanner s = new Scanner(System.in);
        System.out.println("What day of the week is today?");
	String dayOfWeekStr=s.nextLine();
        System.out.println("How may days into the future would you like to know the day of the week?");
        int daysLater=s.nextInt();
        int dayOfWeekInt=0;
        switch(dayOfWeekStr){
            case "Sunday":
                dayOfWeekInt=1;
                break;
            case "Monday":
                dayOfWeekInt=2;
                break;
            case "Tuesday":
                dayOfWeekInt=3;
                break;
            case "Wednesday":
                dayOfWeekInt=4;
                break;
            case "Thursday":
                dayOfWeekInt=5;
                break;
            case "Friday":
                dayOfWeekInt=6;
                break;
            case "Saturday":
                dayOfWeekInt=7;
                break;
        }
        dayOfWeekInt+=daysLater;
        for(int i = 0; i <= daysLater+7; i++){
            if(dayOfWeekInt>=8){
                dayOfWeekInt-=7;
            }else{
                break;
            }
        }
        switch(dayOfWeekInt){
            case 1:
                dayOfWeekStr="Sunday";
                break;
            case 2:
                dayOfWeekStr="Monday";
                break;
            case 3:
                dayOfWeekStr="Tuesday";
                break;
            case 4:
                dayOfWeekStr="Wednesday";
                break;
            case 5:
                dayOfWeekStr="Thursday";
                break;
            case 6:
                dayOfWeekStr="Friday";
                break;
            case 7:
                dayOfWeekStr="Saturday";
                break;
        }
        System.out.println(dayOfWeekStr+"\n");
        end();
    }
    public static void the_circumference_of_a_circle() {
        Scanner s = new Scanner(System.in);
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.print("\nPlease enter the diameter of the circle.\nYour input:");
	int d=s.nextInt();
        double c=d*Math.PI;
        System.out.println("The circumference of the circle is "+twoDForm.format(c));
        end();
    }
    public static void investment() {
        Scanner s = new Scanner(System.in);
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        System.out.print("\nPlease enter the amount you want to invest.\nYour input:");
        double p=s.nextDouble();
        System.out.print("\nPlease enter interest rate.\nYour input:");
        double r=s.nextDouble();
        System.out.print("\nPlease enter the time.\nYour input:");
        double t=s.nextDouble();
        double a=p*Math.pow(Math.E,r*t);
        System.out.println("\nYou'll end up with "+twoDForm.format(a));
        end();
    }
    public static void end() {
        System.out.print("\nThank you for using");
    }
}
