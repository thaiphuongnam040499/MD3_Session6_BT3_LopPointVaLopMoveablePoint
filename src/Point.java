public class Point {
    private float x = 3;
    private float y = 4;

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
    public float[] setXY(){
        return new float[]{x,y};
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

}
