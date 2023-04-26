/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package YoutubeManager;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ThirdPartyYouTubeClass a=new ThirdPartyYouTubeClass();
        while(true){
            System.out.println("Digite la opcion que desea hacer: ");
            System.out.println("1. listar videos");
            System.out.println("2. obtener informacion de un video");
            System.out.println("3. descargar video");
            switch(sc.nextInt()){
                case 1:
                    System.out.println(a.listVideos());
                    break;
                case 2:
                    System.out.println("Digite el id del video");
                    System.out.println(a.getVideoInfo(sc.nextLine()));
                    break;
                case 3:
                    System.out.println("Digite el id del video");
                    System.out.println(a.downloadVideo(sc.nextLine()));                   
            }
        }
    }
    
}
