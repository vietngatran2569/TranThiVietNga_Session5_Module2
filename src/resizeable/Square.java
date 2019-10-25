package resizeable;

public class Square extends Shape implements Reizeable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    public double getPerimeter(){
        return this.side*4;
    }

    @Override
    public String toString() {
        return super.toString()+" Side:"+getSide()
                +" Area:"+getArea()
                +" Perimeter:"+getPerimeter();
    }

    @Override
    public void resize(double percent) {
         this.side+=percent;
        System.out.println("PERCENT="+percent+"AREA AFTER:"+getArea()+"PERIMETER AFTER:"+getPerimeter());
    }
}
