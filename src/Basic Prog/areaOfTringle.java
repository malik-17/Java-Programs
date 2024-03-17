import java.util.Scanner;
public class areaOftringle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base : ");
        int B = input.nextDouble();
        System.out.println("Enter the height : ");
        int H = input.nextDouble();

        double Area = 0.5*B*H;
        System.out.println("Area of Trinle : " +Area);
    }
}