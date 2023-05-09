package bai5;

public class Circle {
    // Thuộc tính của hình tròn
    private double radius;

    // Phương thức khởi tạo với bán kính được truyền vào
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức trả về bán kính của hình tròn
    public double getRadius() {
        return radius;
    }

    // Phương thức thiết lập bán kính của hình tròn
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính diện tích của hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi của hình tròn
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

