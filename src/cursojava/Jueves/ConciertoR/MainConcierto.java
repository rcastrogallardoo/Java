
package cursojava.Jueves.ConciertoR;

import static java.lang.System.in;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MainConcierto {
    public static void main(String[] args) {
        cancion("C:/Users/sandra/Downloads/Musica/cancion2.wav");
    }
    
    private static void cancion(String cancion){
        Thread audio = new Thread(){
            public void run(){
                AudioStream joan = new AudioStream(audio);
            AudioPlayer.player.start(joan);
                
            }
        };
        audio.start();
    }
}
