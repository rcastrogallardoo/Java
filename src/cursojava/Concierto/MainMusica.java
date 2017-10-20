package cursojava.Concierto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MainMusica {
    String cancion;
    
    public  void CargarMusica(String cancion) throws IOException
    {
        this.cancion=cancion;
        
        InputStream in = new FileInputStream(cancion);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
        try{
            Thread.sleep(40000);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        AudioPlayer.player.stop(audio);
    }
}
