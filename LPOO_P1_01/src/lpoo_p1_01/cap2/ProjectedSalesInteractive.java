
package lpoo_p1_01.cap2;

import java.util.Scanner;

public class ProjectedSalesInteractive {
    public static void main(String[] args) {
        //Variables con los valores propuestos
        double incr = 0.10;
        int norte;
        int sur;
        double proyecNorte;
        double proyecSur;
	Scanner entrada = new Scanner(System.in);
        
        //Ingreso de las ventas en las dos divisiones
        System.out.print("Ingrese las ventas en el norte: ");
        norte = entrada.nextInt();
        System.out.print("Ingrese las ventas en el sur: ");
        sur = entrada.nextInt();
        
        //Calculo de las proyecciones
        proyecNorte = norte + (norte * incr);
        proyecSur = sur + (sur * incr);
        
	//Muestra de resultados    
        System.out.println("La cifra de ventas proyectadas para el norte es " + proyecNorte);
        System.out.println("La cifra de ventas proyectadas para el sur es " + proyecSur);
    }   
}
