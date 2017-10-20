import java.io.*;
import sun.audio.*;
public class ArtistaEjemplo
{
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
    public static void main(String [] args)throws Exception
    {
        
        
        ArtistaEjemplo artista = new ArtistaEjemplo();
        ArtistaEjemplo artista2 = new ArtistaEjemplo();
        
        /* artista.nombre = "Gerardo Ortiz";
        artista.generoMusical = "Norteño";
        artista.Genero = "Hombre";
        artista.edad = 28;*/
        artista.display("Gerardo Ortiz", "Hombre", "Norteño",28);
        GerardoOrtiz();
        
    }
    public static void GerardoOrtiz() throws Exception
    {
        String Sonido="C:/Users/sandra/Downloads/Fuiste_Mia.wav";
        InputStream in = new FileInputStream(Sonido);
        AudioStream audio = new AudioStream(in);
        AudioPlayer.player.start(audio);
    }
    
}

/*Tarea
investigar tipo de audio wav
logstica del concierto *Imagenes *Audio */