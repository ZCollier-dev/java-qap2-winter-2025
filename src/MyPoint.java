public class MyPoint {
    //attributes
    private int x;
    private int y;

    //methods
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public String toString(){
        return String.format("x: %d, y: %d", this.x, this.y);
    };
}
