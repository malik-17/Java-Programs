//WAP to calculate Perimeter of a rectangle.
import java.util.Scanner;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter all 4 sides in cms");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a + b + c +d;
        System.out.println("Perimeter of your rectangle is : " + perimeter + "cm");
        input.close();
    }
}
