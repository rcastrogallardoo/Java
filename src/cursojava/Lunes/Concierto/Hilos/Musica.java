package cursojava.Lunes.Concierto.Hilos;

import static cursojava.Lunes.Concierto.Concierto.CargarImagen;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Musica extends Thread{
    public void run(){
        String  Sonido="";
        
        for (int i=1;i<=4;i++)
        {
            
            Sonido="C:/Users/sandra/Downloads/Musica/cancion";
            Sonido+= i+".wav";
            
            InputStream in = null;
            try {
                in = new FileInputStream(Sonido);
            } catch (FileNotFoundException ex) {
               ex.printStackTrace();
            }
            AudioStream audio = null;
            try {
                audio = new AudioStream(in);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            AudioPlayer.player.start(audio);
            
            try {
                Thread.sleep (20000);
            } catch (Exception e) {
                System.out.println(e);
            }
            AudioPlayer.player.stop(audio);
        }
    }
    
}
