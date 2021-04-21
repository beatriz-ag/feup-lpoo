public class Triangle implements AreaShape{
    double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * (this.base /2);
    }

    @Override
    public void draw() {
        System.out.println("Triangle\n");
    }
}
