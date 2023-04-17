public class Point2D {
        private double x = 0;
        private double y = 0;
    public Point2D() {
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
        public void setXY(double x, double y) {
            this.y = y;
            this.x = x;
        }

        public double[] getXY() {
            double[] out = {this.x, this.y};
            return out;
        }

        public String toString() {
            return "Trục X : " + this.x + "," + " Trục Y : " + this.y;
        }
    }
    class Point2DTest {
        public static void main(String[] args) {
            Point2D point2D = new Point2D(3, 5);
            System.out.println(point2D);
        }
    }
 class Point3D extends Point2D {
    private double z = 0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D() {
    }

    public void setXYZ(double x, double y, double z) {
        super.setX(x);
        super.setY(y);
        this.z = z;

    }

    public double[] getXYZ() {
        double[] out = {this.getX(), this.getY(), this.z};
        return out;
    }
    public String toString() {
        return  "Trục X : " + this.getX() + "," + " Trục Y : " + this.getY() + "," + " Trục Z : " + this.z;
    }
}
class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,6,7);
        System.out.println(point3D);
    }
}


