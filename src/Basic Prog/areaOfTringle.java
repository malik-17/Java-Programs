import java.util.Scanner;
public class areaOfTringle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base : ");
        double B = input.nextDouble();
        System.out.println("Enter the height : ");
        double H = input.nextDouble();

        //double Area = 0.5*B*H;
        double Area = (H * B)/2;

        System.out.println("Area of Trinle : " +Area);
        input.close();
    }
}