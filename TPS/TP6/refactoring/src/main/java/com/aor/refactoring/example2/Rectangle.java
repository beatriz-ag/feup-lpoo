package com.aor.refactoring.example2;

public class Rectangle extends Shape{
    double width,height,x,y;
    public  Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public  double getArea(){
        return width * height;}

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void draw(GraphicFramework graphics) {

                graphics.drawLine(x, y, x + width, y);
                graphics.drawLine(x + width, y, x + width, y + height);
                graphics.drawLine(x + width, y + height, x, y + height);
                graphics.drawLine(x, y + height, x, y);

    }
}
