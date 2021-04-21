public class Line implements Shape {
    double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Line\n");
    }
}
