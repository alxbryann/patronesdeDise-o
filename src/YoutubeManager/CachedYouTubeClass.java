
package YoutubeManager;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    
    private ThirdPartyYouTubeLib service;
 
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
