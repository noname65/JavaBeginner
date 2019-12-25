package stringmanipulation;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text1;
        String text2;
        System.out.print("===========================================\n欢迎来到StringManipulation程序!\n===========================================\n请提供你的第一句话:\n");
        text1=s.nextLine();
        System.out.print("\n请告诉我们你的第二句话:\n");
        text2=s.nextLine();
        if(text1==text2){
            System.out.print("\n\n看起来这两个句子是一样的!\n\n这个句子的长度是"+text1.length()+"个字符!");
        }else{
            System.out.print("\n看起来这两个句子是不一样的!\n\n第一个句子的长度是"+text1.length()+"个字符!"+"第二个句子的长度是"+text2.length()+"个字符!");
        }
        System.out.print("\n\n感谢您使用StringManipulation程序!再见!");
    }
    
}
