package stringmanipulation;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text1;
        String text2;
        System.out.print("===========================================\nWelcome to the StringManipulation program!\n===========================================\nPlease provide us with your first sentence:\n");
        text1=s.nextLine();
        System.out.print("\nPlease proivde us with your second sentence:\n");
        text2=s.nextLine();
        String a=text1.toLowerCase().trim();
        String b=text2.toLowerCase().trim();
        if(a.hashCode()==b.hashCode()){
            System.out.print("\n\nIt appears that both of these sentences are the same!\n\nThe length of the sentence is "+a.length()+" characters!");
        }else{
            System.out.print("\nIt appears that both of these sentences are not the same!\n\nFirst length of the sentence is "+a.length()+"characters!"+"Second length of the sentence is "+b.length()+" characters!");
        }
        System.out.print("\n\nThank you for using the StringManipulation program! Bye!");
    }
    
}
