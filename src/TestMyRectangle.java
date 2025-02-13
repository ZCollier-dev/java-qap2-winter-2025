public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(1,2,3,4);
        MyPoint point1 = new MyPoint(-5,6);
        MyPoint point2 = new MyPoint(7,-8);
        MyPoint point3 = new MyPoint(5,-6);
        MyPoint point4 = new MyPoint(-7,-8);
        MyRectangle rectangle2 = new MyRectangle(point1, point2);
        MyRectangle rectangle3 = new MyRectangle(1,2,3,2);

        System.out.println("Rectangle 1:");

        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());

        System.out.println("Rectangle 2:");

        System.out.println(rectangle2.toString());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());

        System.out.println("Rectangle 3:");

        System.out.println(rectangle3.toString());
        System.out.println(rectangle3.getLength());
        System.out.println(rectangle3.getHeight());
        System.out.println(rectangle3.getPerimeter());
        System.out.println(rectangle3.getArea());

        System.out.println("Changing Rectangle 1");

        rectangle1.setStartCorner(point3);
        rectangle1.setEndCorner(point4);

        System.out.println(rectangle1.getStartCorner());
        System.out.println(rectangle1.getEndCorner());

        System.out.println("Changing Rectangle 2");

        rectangle2.setStartCornerX(3);
        rectangle2.setStartCornerY(-3);
        rectangle2.setEndCornerX(-4);
        rectangle2.setEndCornerY(-5);

        int[] rectangle2StartXY = rectangle2.getStartCornerXY();
        int[] rectangle2EndXY = rectangle2.getEndCornerXY();

        System.out.println(String.format("Start Corner (x: %d, y: %d) End Corner (x: %d, y: %d)",rectangle2StartXY[0], rectangle2StartXY[1], rectangle2EndXY[0], rectangle2EndXY[0]));

        System.out.println("Changing Rectangle 3");

        rectangle3.setStartCornerXY(3, 7);
        rectangle3.setEndCornerXY(4, -9);

        System.out.println(rectangle3);
    }
}
