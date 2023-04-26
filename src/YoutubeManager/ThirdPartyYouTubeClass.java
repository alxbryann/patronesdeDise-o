/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package YoutubeManager;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    public String listVideos() {
       return "retornando lista de videos...";
    }

    @Override
    public String getVideoInfo(String id) {
       return "retornando informacion del video " + id + "...";
    }

    @Override
    public String downloadVideo(String id) {
        return "descargando video " + id;
    }    
}
