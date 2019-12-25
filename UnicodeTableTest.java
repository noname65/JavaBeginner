package unicodetabletest;
public class UnicodeTableTest {
    public static String got_index(int input){
        String text="?";
        if(input==0){text="0";}
        if(input==1){text="1";}
        if(input==2){text="2";}
        if(input==3){text="3";}
        if(input==4){text="4";}
        if(input==5){text="5";}
        if(input==6){text="6";}
        if(input==7){text="7";}
        if(input==8){text="8";}
        if(input==9){text="9";}
        if(input==10){text="a";}
        if(input==11){text="b";}
        if(input==12){text="c";}
        if(input==13){text="d";}
        if(input==14){text="e";}
        if(input==15){text="f";}
        return text;
    }
    public static void main(String[] args) {
        char c = '\u0000';
        String text;
        int index1=0;
        int index2=0;
        int index3=0;
        int index4=0;
        int index5=0;
        for(int i = 0; i <= 65536; i++){
            text=got_index(index5)+got_index(index4)+got_index(index3)+got_index(index2)+got_index(index1);
            System.out.print(i+" "+text + "\t");
            System.out.println(c);
            c++;
            index1++;
            if(index1>=16){index2++;index1-=16;}
            if(index2>=16){index3++;index2-=16;}
            if(index3>=16){index4++;index3-=16;}
            if(index4>=16){index5++;index4-=16;}
        }
    }
}
