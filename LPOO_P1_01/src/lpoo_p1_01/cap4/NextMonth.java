/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_01.cap4;
import java.util.GregorianCalendar;
/**
 *
 * @author daniel
 */
public class NextMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar inicio = new GregorianCalendar();
        GregorianCalendar fin = new GregorianCalendar();
        fin.add(GregorianCalendar.MONTH, 1);
        int dia = fin.get(GregorianCalendar.DAY_OF_MONTH);
        fin.add(GregorianCalendar.DATE, -dia);
       
        long dif = fin.getTimeInMillis() - inicio.getTimeInMillis();
        dif = dif/(1000*60*60*24);
        
        System.out.println(dif);
                
    }
    
}
