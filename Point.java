public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float X, float Y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] f = {x, y};
        return f;
    }

    public String toString() {
        return "Point = " + " x = " + x + ", y = " + y;
    }
}
class PointTest {
    public static void main(String[] args) {
        Point point = new Point(3,5);
        System.out.println(point);
    }
}
 class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] f = {xSpeed,ySpeed};
        return f;
    }

    public String toString() {
        return "MoveablePoint = " + " xSpeed : " + xSpeed + ", ySpeed : " + ySpeed + " " + super.toString();
    }
    public float[] MoveablePoint(){
        setXY(getX()+ xSpeed,getY()+ySpeed);
        return getXY();
    }
}
class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(5,6);
        System.out.println(moveablePoint);
    }
}