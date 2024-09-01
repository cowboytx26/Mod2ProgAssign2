/*
Short Description:  This class extends the GeometricClass and provides implementations of getArea and getPerimeter
Author:  Brian Wiatrek
Date:  August 27, 2024
*/
import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{

    private int side1 = 1;
    private int side2 = 1;
    private int side3 = 1;

    public Triangle() {

    }

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    @Override
    public double getArea() {
        return sqrt(getPerimeter()/2*(getPerimeter()/2-side1)*(getPerimeter()/2-side2)*(getPerimeter()/2-side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
