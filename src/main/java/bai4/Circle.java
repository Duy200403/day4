package bai4;

public class Circle {
        private double radius;
        private String color;

        public Circle() {  // 1st (default) constructor
            radius = 1.0;
            color = "red";
        }


        public Circle(double r) {  // 2nd constructor
            radius = r;
            color = "red";
        }

        /** Returns the radius */
        public double getRadius() {
            return radius;
        }


        public double getArea() {
            return radius*radius*Math.PI;
        }

        public double getCircumference(){
            return 2* Math.PI * radius;
        }

        @Override
        public String toString() {
            return "Circle[" +
                    "radius=" + radius +
                    ']';
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


