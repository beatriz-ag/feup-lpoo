public class Ellipse implements AreaShape{
    double xRad, yRad;

    public Ellipse(double xRad, double yRad) {
        this.xRad = xRad;
        this.yRad = yRad;
    }

    public double getxRad() {
        return xRad;
    }

    public double getyRad() {
        return yRad;
    }

    @Override
    public double getArea() {
        return  Math.PI * this.yRad * this.xRad;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse\n");
    }
}
