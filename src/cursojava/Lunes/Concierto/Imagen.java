package cursojava.Lunes.Concierto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public  class Imagen extends Component{
    BufferedImage img = null;
     public void paint(Graphics g){
         g.drawImage(img, 0, 0, null); 
    }
     public Imagen(String imagen){
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
