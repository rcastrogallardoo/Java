
package cursojava.Lunes;

class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static double add (double a, double b){
        return a+b;
    }
}
public class TestOverload2 {
    public static void main(String[] args){
        System.out.println(Adder.add(10, 50));
        System.out.println(Adder.add(12.5, 12.5));
    }
}
