package bai62;

public class Circle implements  GeometricObject{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ",Area=" + getArea() +
                ",peri=" + getPerimeter() +
                ']';
    }
    public double getArea (){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*radius;
    }
}
