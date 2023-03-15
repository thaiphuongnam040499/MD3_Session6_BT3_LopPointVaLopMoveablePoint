public class MoveablePoint extends Point {
    private float xSpeed = 5;
    private float ySpeed = 6;

    public MoveablePoint() {
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
    public void getspeed(float xSpeed,float ySpeed){
        float[] speed ={xSpeed,ySpeed};
    }
    public void setspeed(float xSpeed,float ySpeed){
        float[] speed ={xSpeed,ySpeed};
    }
    public MoveablePoint move(){
        float newXPoint = getX() + xSpeed;
        float newYPoint = getY() + ySpeed;
        setX(newXPoint);
        setY(newYPoint);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{"+"x = "+getX()+ " y = "+getY() +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
