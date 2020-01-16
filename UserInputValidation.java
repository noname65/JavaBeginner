package userinputvalidation;
public class UserInputValidation {
    public static void main(String[] args) {
        int a,b=0,c,d,e=-1;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWelcome to the Pizza and Wings Food Ordering Kiosk\nWe're here to serve you!\n\n\n");
        while (e!=0) {
            a=Options("\nWould you like pizza or wings?",new String[]{null,null,"pizza","wings",null});
            if (a==1){
                b=Options("Would you like your wings hot, medium, or mild?",new String[]{null,null,"hot","medium","mild"});
            }
            System.out.println("\n");
            c=Options("\nWould you like coke or pepsi?",new String[]{null,null,"coke","pepsi",null});
            System.out.println("\n\n");
            d=Options("Would you like your drink small, medium, or large?",new String[]{null,null,"S","M","L"});
            System.out.println("You ordered "+(a==1?new String[]{"hot ","medium ","mild "}[b]:"")+new String[]{"pizza","wings"}[a]+" with a "+new String[]{"small ","medium ","large "}[d]+new String[]{"C.","P."}[c]);
            e=Options("IS this correct?",new String[]{null,null,"yes","no",null});
        }
        System.out.println("Thank you for ordering! Your meal will be ready shortly, enjoy! Please come again soon!\n\n\n");
    }
    public static int Options(String Hint,String[] i){
        int index=-1;
        String a=null;
        while(true){
            System.out.println(Hint+"\nOptions:"+(i[2]!=null?"\n1."+i[2]:"")+(i[3]!=null?"\n2."+i[3]:"")+(i[4]!=null?"\n3."+i[4]:""));
            a=new java.util.Scanner(System.in).nextLine().trim().toLowerCase();
            if(((a==null||i[2]==null)?true:!a.equals(i[2]))&&((a==null||i[3]==null)?true:!a.equals(i[3]))&&((a==null||i[4]==null)?true:!a.equals(i[4]))){
                System.out.println("You did not enter the existing options, please re-enter.");
            }else{
                index=java.util.Arrays.binarySearch(i, a)-2;
                break;
            }
        }
        return index;
    }
}