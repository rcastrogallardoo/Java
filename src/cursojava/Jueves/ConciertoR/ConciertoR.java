package cursojava.Jueves.ConciertoR;

import cursojava.Jueves.ConciertoR.ConciertoRI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ConciertoR implements ConciertoRI{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String  Sonido="";
        Sonido="C:/Users/sandra/Downloads/Musica/cancion2.wav";
        
        
        InputStream in = new FileInputStream(Sonido);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
        
    }
    
}
