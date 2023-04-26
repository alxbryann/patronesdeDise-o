
package YoutubeManager;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public abstract interface ThirdPartyYouTubeLib {
    
    
    public String listVideos();
    
    public String getVideoInfo(String id);
    
    public String downloadVideo(String id);
           
}
