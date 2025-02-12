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

}
