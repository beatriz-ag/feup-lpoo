public class Circle implements AreaShape{
    double rad;
    public Circle(double rad){ this.rad = rad;}

    public double getRadius(){
        return this.rad;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.rad, 2);
    }

    @Override
    public void draw() {
        System.out.println("Circle\n");
    }
}
