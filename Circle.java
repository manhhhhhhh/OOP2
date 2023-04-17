
    public class Circle {
        private double radius;
        private String color;

        public Circle() {

        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
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

        public double getArea() {
            return this.radius * this.radius * Math.PI;
        }

        public String toString() {
            return "Circle =  " + " radius : " +  radius  + "," + " color : " +  color ;
        }
    }
    class CircleTest {
        public static void main(String[] args) {
            Circle circle = new Circle(4, "red");
            System.out.println(circle);

        }
    }
    class Cylinder extends Circle {
        private double heigth;

        public Cylinder(double radius, String color, double heigth) {
            super(radius, color);
            this.heigth = heigth;
        }

        public double getHeigth() {
            return heigth;
        }

        public void setHeigth(double heigth) {
            this.heigth = heigth;
        }

        public double getVolumer() {
            return super.getArea() * this.heigth;
        }
        public String toString(){
            return "Cylinder = " + " radius : " + getRadius() + " Color : " + getColor()  + " heigth : " + getHeigth();
        }
    }
    class CylinderTest {
        public static void main(String[] args) {
           Cylinder cylinder = new Cylinder(3, "red",5);
            System.out.println(cylinder);
        }
    }
