public class Square implements AreaShape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    double getSide(){
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square\n");
    }
}
