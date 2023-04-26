/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observador;

import java.util.Scanner;

/**
 *
 * @author SG701-10
 */
public class ObserverEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Suscribirse a un libro\n"
                    + "2. Desuscribirse a un libro\n"
                    + "3. Salir");
            Observer ob=new Observer();
            Subject DAF=new Subject();  
            Subject CDS=new Subject();
            Subject DQM=new Subject();
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Elija el libro al que se desea suscribir\n"
                            + "1. Diario de Ana Frank\n"
                            + "2. Cien Años De Soledad\n"
                            + "3. Don Quijote de la mancha");                   
                    switch(sc.nextInt()){
                        case 1:
                         
                            DAF.register(ob);
                            DAF.setFlag((int)(Math.random()+1));
                            break;
                        case 2:
                            
                            CDS.register(ob);
                            CDS.setFlag((int)(Math.random()+1));
                            break;
                        case 3:
                            
                            DQM.register(ob);
                            DQM.setFlag((int)(Math.random()+1));
                            break;
                    }
                    break;
                case 2: 
                    System.out.println("Elija el libro al que desea cancelar la suscripcion\n"
                            + "1. Diario de Ana Frank\n"
                            + "2. Cien Años De Soledad\n"
                            + "3. Don Quijote de la mancha");
                    switch(sc.nextInt()){
                        case 1:                          
                            DAF.unregister(ob);
                            DAF.setFlag((int)(Math.random()+1));
                            break;
                        case 2:
                            CDS.unregister(ob);
                            CDS.setFlag((int)(Math.random()+1));
                            break;
                        case 3:
                            DQM.unregister(ob);
                            DQM.setFlag((int)(Math.random()+1));
                            break;
                    }
            }
        }      
    }    
}
