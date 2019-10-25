package colorable;

public class Square implements Colorable{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToClor() {
        System.out.println("Fill four side");
    }
    public String toString(){
        return "Square with side:"+getSide();
    }

}
