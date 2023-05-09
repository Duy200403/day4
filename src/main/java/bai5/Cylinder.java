package bai5;

public class Cylinder {
    // Thuộc tính của hình trụ
    private Circle base;
    private double height;

    // Phương thức khởi tạo với bán kính và chiều cao được truyền vào
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    // Phương thức trả về chiều cao của hình trụ
    public double getHeight() {
        return height;
    }

    // Phương thức thiết lập chiều cao của hình trụ
    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính thể tích của hình trụ
    public double getVolume() {
        return base.getArea() * height;
    }
}

