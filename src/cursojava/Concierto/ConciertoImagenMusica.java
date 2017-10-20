package cursojava.Concierto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class ConciertoImagenMusica extends Component{
     BufferedImage img = null;
    
    public static void main(String[] args) throws Exception {
        String imagen="";
        imagen="C:/Users/sandra/Downloads/Imagenes/imagen2";
        imagen+=".jpg";
        
        JFrame f=new JFrame("Joan Sebastian");
        f.addWindowListener(new WindowAdapter (){
            public void wiindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        f.add(new ConciertoImagenMusica(imagen));
        f.pack();
        f.setVisible(true);
        Musica();
    }
    
   public void paint(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
    public ConciertoImagenMusica(String imagen){
        try{
            img = ImageIO.read(new File(imagen));
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public Dimension getPreferredSize(){
        if(img == null){
            return new Dimension (100,100);
        }else{
            return new Dimension(img.getWidth(null),img.getHeight(null));
        }
    }
    
    public static void Musica() throws Exception
    {
        String  Sonido="";
        
        Sonido="C:/Users/sandra/Downloads/Musica/cancion2";
        Sonido+=".wav";
        
        InputStream in = new FileInputStream(Sonido);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
        
        
    }
    
}
