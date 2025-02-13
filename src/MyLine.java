public class MyLine {
    //attributes
    private MyPoint begin;
    private MyPoint end;

    //methods
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin(){
        return this.begin;
    }
    public MyPoint getEnd(){
        return this.end;
    }
    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }
    public int[] getBeginXY(){
        return new int[]{this.begin.getX(), this.begin.getY()};
    }
    public int[] getEndXY(){
        return new int[]{this.end.getX(), this.end.getY()};
    }

    public void setBegin(MyPoint begin){
        this.begin = begin;
    }
    public void setEnd(MyPoint end){
        this.end = end;
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }

    public double getLength(){
        //a^2 = b^2 + c^2, basically a triangle's hypotenuse, a=sqrt(b^2 + c^2)
        return Math.sqrt(Math.pow((getEndX() - getBeginX()), 2) + Math.pow((getEndY() - getBeginY()), 2));
    }

    public double getGradient(){
        //Gets the angle in radians
        return Math.atan2((getEndX() - getBeginX()), (getEndY() - getBeginY()));
    }

    public String toString(){
        return String.format("MyLine[begin=(%d,%d),end=(%d,%d)]", getBeginX(), getBeginY(), getEndX(), getEndY());
    }
}
