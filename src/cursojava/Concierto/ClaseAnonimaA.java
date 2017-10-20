package cursojava.Concierto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ClaseAnonimaA {
    String Sonido;
    public static void main(String[] args) throws IOException  {
        PlayMusic("C:/Users/sandra/Downloads/Musica/cancion2.wav");
    }
    public static void PlayMusic(String Sonido) throws IOException{
        
        InputStream in = new FileInputStream(Sonido);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }
    
}
