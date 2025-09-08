package test0908;

import org.w3c.dom.css.Rect;

class Point {
    public int x = 0;
    public int y = 0;

    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return width * height;
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("Width of rectOwn: " + rectOne.width);
        System.out.println("Height of rectOen: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        rectTwo.origin = originOne;

        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);

        rectTwo.move(40, 72);
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);
    }
}
