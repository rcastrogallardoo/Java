
package cursojava.Lunes;
//Sobre Carga de metodos por numero de argumentos
class Add{
    static int add (int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class TestOverload {
    public static void main(String[] args){
        System.out.println(Add.add(111,111));
        System.out.println(Add.add(10, 20,100));
    }
}
