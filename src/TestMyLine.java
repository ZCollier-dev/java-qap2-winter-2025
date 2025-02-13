public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1,2,3,4);
        MyPoint point1 = new MyPoint(-5,6);
        MyPoint point2 = new MyPoint(7,-8);
        MyPoint point3 = new MyPoint(5,-6);
        MyPoint point4 = new MyPoint(-7,-8);
        MyLine line2 = new MyLine(point1, point2);
        MyLine line3 = new MyLine(1,2,3,2);

        System.out.println("Line 1:");

        System.out.println(line1.toString());
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());

        System.out.println("Line 2:");

        System.out.println(line2.toString());
        System.out.println(line2.getLength());
        System.out.println(line2.getGradient());

        System.out.println("Line 3:");

        System.out.println(line3.toString());
        System.out.println(line3.getLength());
        System.out.println(line3.getGradient());

        System.out.println("Changing Line 1");

        line1.setBegin(point3);
        line1.setEnd(point4);

        System.out.println(line1.getBegin());
        System.out.println(line1.getEnd());

        System.out.println("Changing Line 2");

        line2.setBeginX(3);
        line2.setBeginY(-3);
        line2.setEndX(-3);
        line2.setEndY(-5);

        int[] line2BeginXY = line2.getBeginXY();
        int[] line2EndXY = line2.getEndXY();

        System.out.println(String.format("Begin (x: %d, y: %d) End (x: %d, y: %d)",line2BeginXY[0], line2BeginXY[1], line2EndXY[0], line2EndXY[0]));

        System.out.println("Changing Line 3");

        line3.setBeginXY(3, 7);
        line3.setEndXY(4, -9);

        System.out.println(line3);
    }
}
