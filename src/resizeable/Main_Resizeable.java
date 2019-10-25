package resizeable;

public class Main_Resizeable {
    public static void main(String[] args) {
        Square[] squares=new Square[2];
        squares[0]=new Square(3);
        squares[1]=new Square("RED",true,9);

        System.out.println("Print after:");
        for (Square a:squares){
            System.out.println(a);
        }
        System.out.println("Print before:");
        for (Square a:squares){
            a.resize(9);
        }

    }
}
