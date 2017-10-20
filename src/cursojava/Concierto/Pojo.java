package cursojava.Concierto;

public class Pojo {
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
    
    public void display()
    {
        this.nombre = "Gerardo";
        this.Genero = "Hombre";
        this.generoMusical = "Norteño";
        this.edad = 28;
        
        System.out.println(nombre+" "+edad+" años "+Genero+" "+generoMusical);
    }
    public static void main(String[] args) throws Exception
    {
        Pojo artista = new Pojo();
        
        artista.display();
        
    }
}
