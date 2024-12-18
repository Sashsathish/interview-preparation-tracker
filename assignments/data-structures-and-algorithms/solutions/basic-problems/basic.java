
import java.util.*;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  instead of making 20 files did it in one file
        //  Addition Of Two Numbers
        System.out.print("Enter two numbers for addition: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        //  Area Of Circle
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));

        //  Area Of Triangle
        System.out.print("Enter base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * height));

        //  Area Of Rectangle
        System.out.print("Enter length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (length * breadth));

        //  Area Of Isosceles Triangle
        System.out.print("Enter base and height of the isosceles triangle: ");
        base = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Area of Isosceles Triangle: " + (0.5 * base * height));

        //  Area Of Parallelogram
        System.out.print("Enter base and height of the parallelogram: ");
        base = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Area of Parallelogram: " + (base * height));

        //  Area Of Rhombus
        System.out.print("Enter diagonals of the rhombus: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Area of Rhombus: " + (0.5 * d1 * d2));

        //  Area Of Equilateral Triangle
        System.out.print("Enter side of the equilateral triangle: ");
        double side = sc.nextDouble();
        System.out.println("Area of Equilateral Triangle: " + ((Math.sqrt(3) / 4) * side * side));

        //  Perimeter Of Circle
        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));

        //  Perimeter Of Equilateral Triangle
        System.out.print("Enter side of the equilateral triangle: ");
        side = sc.nextDouble();
        System.out.println("Perimeter of Equilateral Triangle: " + (3 * side));

        //  Perimeter Of Parallelogram
        System.out.print("Enter base and side of the parallelogram: ");
        base = sc.nextDouble();
        side = sc.nextDouble();
        System.out.println("Perimeter of Parallelogram: " + (2 * (base + side)));

        //  Perimeter Of Rectangle
        System.out.print("Enter length and breadth of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));

        //  Perimeter Of Square
        System.out.print("Enter side of the square: ");
        side = sc.nextDouble();
        System.out.println("Perimeter of Square: " + (4 * side));

        //  Perimeter Of Rhombus
        System.out.print("Enter side of the rhombus: ");
        side = sc.nextDouble();
        System.out.println("Perimeter of Rhombus: " + (4 * side));

        //  Volume Of Cone
        System.out.print("Enter radius and height of the cone: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Volume of Cone: " + (1.0 / 3 * Math.PI * radius * radius * height));

        //  Volume Of Prism
        System.out.print("Enter base area and height of the prism: ");
        double baseArea = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Volume of Prism: " + (baseArea * height));

        //  Volume Of Cylinder
        System.out.print("Enter radius and height of the cylinder: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Volume of Cylinder: " + (Math.PI * radius * radius * height));

        //  Volume Of Sphere
        System.out.print("Enter radius of the sphere: ");
        radius = sc.nextDouble();
        System.out.println("Volume of Sphere: " + ((4.0 / 3) * Math.PI * Math.pow(radius, 3)));

        //  Volume Of Pyramid
        System.out.print("Enter base area and height of the pyramid: ");
        baseArea = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Volume of Pyramid: " + (1.0 / 3 * baseArea * height));

        //  Curved Surface Area Of Cylinder
        System.out.print("Enter radius and height of the cylinder: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Curved Surface Area of Cylinder: " + (2 * Math.PI * radius * height));

        sc.close();
    }
}
