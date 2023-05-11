package bai62;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        Circle c = new Circle(4);
//        c.getArea();
//        c.getPerimeter();
//        System.out.println("area: "+ c.getArea());
//        System.out.println("perimeter "+ c.getPerimeter());
//        Rectangle r = new Rectangle(2,4);
//        System.out.println("area: "+ c.getArea());
//        System.out.println("perimeter: "+ c.getPerimeter());
        ArrayList<GeometricObject> hinh = new ArrayList<>();
        // Mang nay co the chua 1 hinh bat ki,mien la implement tu IHinhHoc3D
        Circle ht = new Circle(4);
        Rectangle hcn = new Rectangle(5,6);
        hinh.add(ht);
        hinh.add(hcn);
        for (GeometricObject h : hinh) {
            System.out.println(h);
        }
    }

}



