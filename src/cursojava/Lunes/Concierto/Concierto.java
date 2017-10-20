
package cursojava.Lunes.Concierto;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import sun.audio.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Concierto {
    private String nombre,generoMusical,Genero;
    private int edad;
    
    public String getnombre()
    {
        return nombre;
    }
    public String getgeneroMusical()
    {
        return generoMusical;
    }
    public String getgenero()
    {
        return Genero;
    }
    public int getedad()
    {
        return edad;
    }
    public boolean setnombre(String nombre)
    {
        if(!nombre.isEmpty())
        {
            this.nombre = nombre;
            return true;
        }
        else
            return false;
        
    }
    public boolean setgeneroMusical(String generoMusical)
    {
        if(!generoMusical.isEmpty())
        {
            this.generoMusical = generoMusical;
            return true;
        }
        else
            return false;
        
    }
    public boolean setgenero(String genero)
    {
        if(!Genero.isEmpty())
        {
            this.Genero = genero;
            return true;
        }
        else
            return false;
    }
    public boolean setedad(int edad)
    {
        if(edad > 0)
        {
            this.edad = edad;
            return true;
        }
        else
            return false;
        
    }
    
    public void display(String nombre,String genero,String generomusical, int edad)
    {
        this.nombre = nombre;
        this.Genero = genero;
        this.generoMusical = generomusical;
        this.edad = edad;
        
        System.out.println(nombre+" "+edad+" años "+genero+" "+generomusical);
    }
    public static void main(String[] args) throws Exception
    {
        Concierto artista = new Concierto();
        
        artista.display("Gerardo Ortiz", "Hombre", "Norteño",28);
        CargarImagen();
        //GerardoOrtiz();
        
    }
    
    public static void GerardoOrtiz() throws Exception
    {
        String  Sonido="";
        
        for (int i=1;i<=3;i++)
        {
            //CargarImagen();
            Sonido="C:/Users/sandra/Downloads/Musica/cancion";
            Sonido+= i+".wav";
            
            InputStream in = new FileInputStream(Sonido);
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
            
            try {
                Thread.sleep (60000);
            } catch (Exception e) {
                System.out.println(e);
            }
            AudioPlayer.player.stop(audio);
        }
    }
    
    public static void CargarImagen(){
        String imagen="";
        
        for(int i = 1;i<=3;i++){
            imagen="C:/Users/sandra/Downloads/Imagenes/imagen";
            imagen+=i+".jpg";
            if(i==1){
                JFrame f=new JFrame("Gerardo Ortiz");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagen(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (10000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            else if(i==2){
                JFrame f=new JFrame("Joan Sebastian");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagen(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (10000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            else if(i==3){
                JFrame f=new JFrame("Alfredito Olivas");
                f.addWindowListener(new WindowAdapter (){
                    public void wiindowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                f.add(new Imagen(imagen));
                f.pack();
                f.setVisible(true);
                try {
                    Thread.sleep (10000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                f.setVisible(false);
            }
            
            
            
        }
        
        
        
    }
    
}


//Tarea Investigar java.IO que hacen las clases