package cursojava.Lunes.Concierto.Hilos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.JFrame;



public class Concierto extends Thread{
    BufferedImage img = null;
    public void run() {
        try {
            for(int i = 1;i<=3;i++){
                if(i == 1)
                {
                    FileOutputStream fout =
                            new FileOutputStream("C:\\Gerardo.txt");
                    PrintStream ps = new PrintStream(fout);
                    ps.println("Edad: 28 Años");
                    ps.println("Genero Musical: Norteño");
                    ps.println("Nombre: Gerardo Ortiz");
                    ps.println(" ");
                    FileReader fr = new FileReader("C:\\Gerardo.txt");
                    int j;
                    while((j=fr.read())!=-1){
                        System.out.print((char)j);
                        
                    }
                    try {
                        Thread.sleep (20000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ps.close();
                    fout.close();
                }
                else if(i == 2)
                {
                    FileOutputStream fout =
                            new FileOutputStream("C:\\Joan.txt");
                    PrintStream ps = new PrintStream(fout);
                    ps.println("Edad: -- Años");
                    ps.println("Genero Musical: Norteño");
                    ps.println("Nombre: Joan Sebastian");
                    ps.println(" ");
                    FileReader fr = new FileReader("C:\\Joan.txt");
                    int j;
                    while((j=fr.read())!=-1){
                        System.out.print((char)j);
                        
                    }
                    try {
                        Thread.sleep (20000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ps.close();
                    fout.close();
                }
                else if(i == 3)
                {
                    FileOutputStream fout =
                            new FileOutputStream("C:\\Alfre.txt");
                    PrintStream ps = new PrintStream(fout);
                    ps.println("Edad: 27 Años");
                    ps.println("Genero Musical: Norteño");
                    ps.println("Nombre: Alfredito Olivas");
                    ps.println(" ");
                    FileReader fr = new FileReader("C:\\Alfre.txt");
                    int j;
                    while((j=fr.read())!=-1){
                        System.out.print((char)j);
                        
                    }
                    try {
                        Thread.sleep (20000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ps.close();
                    fout.close();
                }
                
            }
            
            System.out.println("El Concierto Terminado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void main(String[] args) {
        Musica music = new Musica();
        Concierto ar = new Concierto();
        Runnable imga = new Runnable() {
            public void run() {
                
                String imagen="";
                
                for(int i = 1;i<=4;i++){
                    imagen="C:/Users/sandra/Downloads/Imagenes/imagen";
                    imagen+=i+".jpg";
                    if(i==1){
                        JFrame f=new JFrame("Gerardo Ortiz");
                        f.addWindowListener(new WindowAdapter (){
                            public void wiindowClosing(WindowEvent e){
                                System.exit(0);
                            }
                        });
                        f.add(new Imagenes(imagen));
                        f.pack();
                        f.setVisible(true);
                        try {
                            Thread.sleep (20000);
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
                        f.add(new Imagenes(imagen));
                        f.pack();
                        f.setVisible(true);
                        try {
                            Thread.sleep (20000);
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
                        f.add(new Imagenes(imagen));
                        f.pack();
                        f.setVisible(true);
                        try {
                            Thread.sleep (20000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        f.setVisible(false);
                    }
                    else if(i==4){
                        JFrame f=new JFrame("Publico");
                        f.addWindowListener(new WindowAdapter (){
                            public void wiindowClosing(WindowEvent e){
                                System.exit(0);
                            }
                        });
                        f.add(new Imagenes(imagen));
                        f.pack();
                        f.setVisible(true);
                        try {
                            Thread.sleep (11000);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        f.setVisible(false);
                    }
                    
                }
            }
            
        };
        Thread img =
                new Thread(imga);
        img.start();
        ar.start();
        music.start();
        
        
    }
    public void paint(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
    
    public Dimension getPreferredSize(){
        if(img == null){
            return new Dimension (100,100);
        }else{
            return new Dimension(img.getWidth(null),img.getHeight(null));
        }
    }
}
