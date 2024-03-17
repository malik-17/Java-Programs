import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principle amount Rs : ");
        float principle = input.nextFloat();
        System.out.println("Now, Tell me your rate of interest : ");
        float rate = input.nextFloat();
        System.out.println("Now, Tell me now how many years are borrowing :");
        float years = input.nextFloat();
        float interest = (principle * rate * years)/100;
        System.out.println("\n\n Your simple Interest is : " + interest); 
        input.close();
    }
}
