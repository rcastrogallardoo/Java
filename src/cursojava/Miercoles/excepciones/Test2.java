
package cursojava.Miercoles.excepciones;


public class Test2 {
    public static void main(String[] args){
        try{
            int a[] = new int [5];
            a[6]= 30/2;
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }catch (ArrayIndexOutOfBoundsException aioe){
            System.out.println(aioe);
        }
        System.out.println("Lo que sea...");
    }
}
