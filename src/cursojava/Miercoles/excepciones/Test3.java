
package cursojava.Miercoles.excepciones;

public class Test3 {
    public static void main(String[] args){
        try{
            try{
                System.out.println("Division");
                int b = 39/0;
            }catch(ArithmeticException ae){
                System.out.println(ae);
            }finally{
            System.out.println("Siempre se ejecuta");
        }
            try{
                int a[] = new int[5];
                a[5]=4;
            }catch (ArrayIndexOutOfBoundsException aioe){
                System.out.println(aioe);
            }finally{
            System.out.println("Siempre se ejecuta");
        }
        }catch(Exception e){
            System.out.println("Excepcion Manejada");
        }finally{
            System.out.println("Siempre se ejecuta");
        }
        System.out.println("Lo que sigue");
    }
}
