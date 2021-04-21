public class Rectangle implements AreaShape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle\n");
    }
}
