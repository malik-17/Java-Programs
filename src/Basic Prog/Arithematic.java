import java.util.Scanner;
public class Arithematic {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Arithmetic Calculator");
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now, Enter the second number:  ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println("Addition is : "+add);
        System.out.println("Subtraction is : "+sub);
        System.out.println("Multiplication is : "+mul);
        System.out.println("Division is : "+div);
        System.out.println("Mod is : "+mod);
    }
}
