package cursojava.Concierto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class ConciertoImagenes extends Component{
    BufferedImage img = null;
    
    public static void main(String[] args) {
        String imagen="";
        imagen="C:/Users/sandra/Downloads/Imagenes/imagen1";
        imagen+=".jpg";
        
        JFrame f=new JFrame("Gerardo Ortiz");
        f.addWindowListener(new WindowAdapter (){
            public void wiindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        f.add(new ConciertoImagenes(imagen));
        f.pack();
        f.setVisible(true);
    }
    
   public void paint(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
    public ConciertoImagenes(String imagen){
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
    
}