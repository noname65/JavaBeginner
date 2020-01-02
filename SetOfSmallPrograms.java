package setofsmallprograms;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import java.io.IOException;
public class SetOfSmallPrograms {
    static int language;
    public static void Select_the_language(){
        while(language<1||language>2){
            Scanner in = new Scanner(System.in);
            System.out.println("language:\n1.简体中文\n2.English");
            language=in.nextInt();
        }
    }
    public static void Select_the_program() throws IOException{
        Scanner in = new Scanner(System.in);
        String[] text = new String[99];
        int choice;
        print_text(0,text);
        while(true){
            choice=in.nextInt();
            if(choice==1){
                small_program_1();
                break;
            }else if(choice==2){
                small_program_2();
                break;
            }else if(choice==3){
                small_program_3();
                break;
            }else if(choice==4){
                small_program_4();
                break;
            }else if(choice==5){
                small_program_5();
                break;
            }else if(choice==6){
                small_program_6();
                break;
            }else if(choice==7){
                small_program_7();
                break;
            }else if(choice==8){
                small_program_8();
                break;
            }else if(choice==9){
                small_program_9();
                break;
            }else if(choice==10){
                small_program_10();
                break;
            }else{
                print_text(1,text);
            }
        }
    }
    public static void print_text(int i,String[] text){System.out.print(got_text(i,text));}
    public static String got_text(int i,String[] text){
        String s="";
        int a=0;
        String[][] text1 = new String[3][99];
        text1[1][a]="\n选择程序。\n共有十个程序，对应测试1中的10个程序，请输入1到10进行选择。\n你的选择：";
        text1[2][a]="\nSelect the program.\nThere are 10 programs, corresponding to the 10 programs in test 1. Please enter 1 to 10 for selection.\nYour choice:";
        a=1;
        text1[1][a]="\n你输入的并非1到10之间的整数，请重新输入。\n你的选择：";
        text1[2][a]="\nYou did not enter an integer between 1 and 10. Please re-enter.\nYour choice:";
        a=2;
        text1[1][a]="\n输入两个数字。\n第一次输入：a=";
        text1[2][a]="\nEnter two Numbers.\nFirst input:a=";
        a=3;
        text1[1][a]="\n第二次输入：b=";
        text1[2][a]="\nSecond input:b=";
        a=4;
        text1[1][a]="\n第一次输出：\n";
        text1[2][a]="\nFirst output:\n";
        a=5;
        text1[1][a]="\n第二次输出：\n";
        text1[2][a]="\nSecond output:\n";
        a=6;
        text1[1][a]="\n该程序已结束，请选择程序或结束程序。\n1.选择程序\n2.结束程序\n";
        text1[2][a]="\nThis program has ended. Please select program or end program.\n1.Select the program\n2.End of the program\n";
        a=7;
        text1[1][a]="\n感谢使用。\n";
        text1[2][a]="\nThank you for using.\n";
        a=8;
        text1[1][a]="\n请输入：\n";
        text1[2][a]="\nPlease enter:\n";
        a=9;
        text1[1][a]="\n现在是星期几？\n";
        text1[2][a]="\nWhat day is it now?\n";
        a=10;
        text1[1][a]="\n二十三天后是星期"+text[0]+"。\n";
        text1[2][a]="\nIt's "+text[0]+" in 23 days.\n";
        a=11;
        text1[1][a]="\n砍掉他们的脑袋！\n";
        text1[2][a]="\nOff with their head!\n";
        a=12;
        text1[1][a]="\n请输入一个数字：\n";
        text1[2][a]="\nPlease enter a number:\n";
        a=13;
        text1[1][a]="\n这个数字";
        text1[2][a]="\nThis number is ";
        if("true".equals(text[0])){
            text1[1][a]+="大于50，";
            text1[2][a]+="greater than 50,";
        }else{
            text1[1][a]+="小于50，";
            text1[2][a]+="less than 50,";
        }
        if("true".equals(text[1])){
            text1[1][a]+="它是一个偶数。\n";
            text1[2][a]+="it's an even number.\n";
        }else{
            text1[1][a]+="它是一个奇数。\n";
            text1[2][a]+="it's an odd number.\n";
        }
        a=14;
        text1[1][a]="\n输出随机数："+(int)Math.ceil(Math.random()*10)+"\n";
        text1[2][a]="\nOutput random number:"+(int)Math.ceil(Math.random()*10)+"\n";
        a=15;
        text1[1][a]="\n你是了不起的。\n";
        text1[2][a]="\nYou are amazing.\n";
        a=16;
        text1[1][a]="\n请输入数字或输入完成(done)计算结果。\n";
        text1[2][a]="\nPlease enter Numbers or enter done(完成) results.\n";
        a=17;
        text1[1][a]="\n你输入的不是已知命令。\n";
        text1[2][a]="\nYou're not typing a known command.\n";
        a=18;
        text1[1][a]="\n\n";
        text1[2][a]="\n\n";
        return text1[language][i];
    }
    public static void main(String[] args) throws IOException {
        Select_the_language();
        Select_the_program();
        end();
    }
    public static void small_program_1(){
        String[] text = new String[99];
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        print_text(2,text);
        a=in.nextInt();
        print_text(3,text);
        b=in.nextInt();
        print_text(4,text);
        System.out.print("a="+a+"\nb="+b);
        c=a;
        a=b;
        b=c;
        print_text(5,text);
        System.out.print("a="+a+"\nb="+b);
    }
    public static void small_program_2(){
        String[] text = new String[99];
        Scanner s = new Scanner(System.in);
        String a="";
        while(!("no".equals(a.trim().toLowerCase()))){
            print_text(8,text);
            a=s.nextLine();
        }
    }
    public static void small_program_3(){
        String[] text = new String[99];
        Scanner s = new Scanner(System.in);
        int a=0;
        print_text(9,text);
        while(!(a>=1 && a<=7)){
            a=s.nextInt();
        }
        a+=23;
        while(a>7){
            a-=7;
        }
        if(a==1){
            if(language==1){
                text[0]="日";
            }else if(language==2){
                text[0]="Sunday";
            }
        }else if(a==2){
            if(language==1){
                text[0]="一";
            }else if(language==2){
                text[0]="Monday";
            }
        }else if(a==3){
            if(language==1){
                text[0]="二";
            }else if(language==2){
                text[0]="Tuesday";
            }
        }else if(a==4){
            if(language==1){
                text[0]="三";
            }else if(language==2){
                text[0]="Wednesday";
            }
        }else if(a==5){
            if(language==1){
                text[0]="四";
            }else if(language==2){
                text[0]="Thursday";
            }
        }else if(a==6){
            if(language==1){
                text[0]="五";
            }else if(language==2){
                text[0]="Friday";
            }
        }else if(a==7){
            if(language==1){
                text[0]="六";
            }else if(language==2){
                text[0]="Saturday";
            }
        }
        print_text(10,text);
    }
    public static void small_program_4(){
        String[] text = new String[99];
        Scanner s = new Scanner(System.in);
        int b=0;
        String a;
        String c="heart";
        print_text(8,text);
        a=s.nextLine();
        for(int i=0;i<a.length();i++){
            if(a.toLowerCase().substring(i,i+1) == null ? c.substring(b,b+1) == null : a.toLowerCase().substring(i,i+1).equals(c.substring(b,b+1))){
                b++;
                if(b==5){
                    print_text(11,text);
                    break;
                }
            }else if(a.toLowerCase().substring(i,i+1) == null ? c.substring(0,1) == null : a.toLowerCase().substring(i,i+1).equals(c.substring(0,1))){
                b=1;
            }else{
                b=0;
            }
        }
    }
    public static void small_program_5(){
        String[] text = new String[99];
        print_text(14,text);
    }
    public static void small_program_6(){
        String[] text = new String[99];
        Scanner s = new Scanner(System.in);
        int a;
        print_text(12,text);
        a=s.nextInt();
        if(a>50){text[0]="true";}else{text[0]="false";}
        if(a%2==0){text[1]="true";}else{text[1]="false";}
        print_text(13,text);
    }
    public static void small_program_7() throws IOException{
        int x=0;
        File a;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setAcceptAllFileFilterUsed(false);
        final String[][] fileENames = { { ".txt", "文本文档(*.txt)" }};
        fileChooser.addChoosableFileFilter(new FileFilter() {
            public boolean accept(File file) {
            return true;
            }
            public String getDescription() {
                return "所有文件(*.*)";
            }
        });
        for (final String[] fileEName : fileENames) {
            fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                public boolean accept(File file) { 
                    if (file.getName().endsWith(fileEName[0]) || file.isDirectory()) {
                        return true;
                    }
                    return false;
                }
                public String getDescription() {
                    return fileEName[1];
                }
            });
        }
        fileChooser.showDialog(null, null);
        a=fileChooser.getSelectedFile();
        Scanner fileIn = new Scanner(a);
        while(fileIn.hasNext()){
            x+=Integer.parseInt(fileIn.nextLine());
        }
        System.out.println("\n"+x);
    }
    public static void small_program_8(){
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print("*");
        }
    }
    public static void small_program_9(){
        String[] text = new String[99];
        Scanner s = new Scanner(System.in);
        while(true){
            print_text(15,text);
            s.nextLine();
        }
    }
    public static void small_program_10(){
        String[] text = new String[99];
        String[] t = {"0","1","2","3","4","5","6","7","8","9"};
        Scanner s = new Scanner(System.in);
        String a="";
        int b=0;
        boolean k;
        while(true){
            k=false;
            print_text(16,text);
            a=s.nextLine();
            if(!("done".equals(a.trim().toLowerCase())||"完成".equals(a.trim()))){
                for(int i=0;i<a.length();i++){
                    k=true;
                    for(int f=0;f<10;f++){
                        if(a.trim().substring(i,i+1) == null ? t[f] == null : a.trim().substring(i,i+1).equals(t[f])){
                            k=false;
                        }
                    }
                    if(k){
                        break;
                    }
                }
            }else{
                break;
            }
            if(!k){
                b+=Integer.parseInt(a);
            }else{
                print_text(17,text);
            }
        }
        System.out.println("\n"+b);
    }
    public static void end() throws IOException{
        String[] text = new String[99];
        Scanner in = new Scanner(System.in);
        int a=0;
        print_text(6,text);
        while(!(a==1||a==2)){
            a=in.nextInt();
        }
        if(a==1){
            Select_the_program();
            end();
        }else{
            print_text(7,text);
        }
    }
}
