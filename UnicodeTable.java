/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicodetable;

/**
 *
 * @author Administrator
 */
public class UnicodeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c = '\u0041';
        int a=0;
        for(int i=65;i<=88;i++){
            System.out.print(i+" "+c+"    ");
            c++;
            a++;
            if(a==8){
                System.out.println("");
                a=0;
            };
        }
    }
    
}
