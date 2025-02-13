public class MyRectangle {
    //attributes
    private MyPoint startCorner;
    private MyPoint endCorner;

    //methods
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.startCorner = new MyPoint(x1, y1);
        this.endCorner = new MyPoint(x2, y2);}
    public MyRectangle(MyPoint startCorner, MyPoint endCorner){
        this.startCorner = startCorner;
        this.endCorner = endCorner;
    }

    public MyPoint getStartCorner(){
        return this.startCorner;
    }
    public MyPoint getEndCorner(){
        return this.endCorner;
    }
    public int getStartCornerX(){
        return this.startCorner.getX();
    }
    public int getStartCornerY(){
        return this.startCorner.getY();
    }
    public int getEndCornerX(){
        return this.endCorner.getX();
    }
    public int getEndCornerY(){
        return this.endCorner.getY();
    }
    public int[] getStartCornerXY(){
        return new int[]{this.startCorner.getX(), this.startCorner.getY()};
    }
    public int[] getEndCornerXY(){
        return new int[]{this.endCorner.getX(), this.endCorner.getY()};
    }

    public void setStartCorner(MyPoint startCorner){
        this.startCorner = startCorner;
    }
    public void setEndCorner(MyPoint endCorner){
        this.endCorner = endCorner;
    }
    public void setStartCornerX(int x){
        this.startCorner.setX(x);
    }
    public void setStartCornerY(int y){
        this.startCorner.setY(y);
    }
    public void setEndCornerX(int x){
        this.endCorner.setX(x);
    }
    public void setEndCornerY(int y){
        this.endCorner.setY(y);
    }
    public void setStartCornerXY(int x, int y){
        this.startCorner.setX(x);
        this.startCorner.setY(y);
    }
    public void setEndCornerXY(int x, int y){
        this.endCorner.setX(x);
        this.endCorner.setY(y);
    }
}
