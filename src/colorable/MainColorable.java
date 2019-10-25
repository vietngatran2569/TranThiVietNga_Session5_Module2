package colorable;

public class MainColorable {
    public static void main(String[] args) {
        Square[]squares=new Square[2];
        squares[0]=new Square(2);
        squares[1]=new Square(4);

        for (Square i:squares){
            System.out.println(i);
            i.howToClor();
        }
    }
}
