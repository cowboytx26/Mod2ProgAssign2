/*
Short Description:  This program will prompt the user for input to build a triangle.  The user will supply the length
                    of each of the three sides, at which point the program will call the triangle constructor with
                    the three sides, then the program will prompt the user for the color and a boolean representing
                    whether the triangle color is filled in or not.
Author:  Brian Wiatrek
Date:  August 27, 2024
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter length of the first side:\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputSide1 = Integer.parseInt(reader.readLine());

        System.out.println("Please enter length of the second side:\n");
        reader = new BufferedReader(new InputStreamReader(System.in));
        int inputSide2 = Integer.parseInt(reader.readLine());

        System.out.println("Please enter length of the third side:\n");
        reader = new BufferedReader(new InputStreamReader(System.in));
        int inputSide3 = Integer.parseInt(reader.readLine());

        System.out.println("Please enter the color of the triangle:\n");
        reader = new BufferedReader(new InputStreamReader(System.in));
        String inputColor = reader.readLine();

        System.out.println("Please enter true if the triangle is filled in:\n");
        Scanner scanner = new Scanner(System.in);
        Boolean inputFilledIn = scanner.nextBoolean();

        Triangle MyTriangle1 = new Triangle(inputSide1,inputSide2,inputSide3);

        MyTriangle1.setColor(inputColor);
        MyTriangle1.setFilled(inputFilledIn);

        System.out.printf("Perimeter: %.2f\n", MyTriangle1.getPerimeter());
        System.out.printf("Area: %.2f\n", MyTriangle1.getArea());
        System.out.printf("Triangle %s\n", MyTriangle1);
        System.out.printf("Color %s\n", MyTriangle1.getColor());
        System.out.printf("Filled In: %b", MyTriangle1.isFilled());
    }
}