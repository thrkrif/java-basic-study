package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 5;
        rec.height = 8;
        int area = rec.calculateArea();

        int perimeter =  rec.calculatePerimeter();

        boolean sqaure = rec.isSquare();


        System.out.println("넓이: " + area);
        System.out.println("둘레: " + perimeter);
        System.out.println("정사각형 여부: " + sqaure);
    }
}
