import java.util.*;
public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to temperature converter");
        System.out.println("Enter your temperature in F : ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5.0f / 9.0f;
        System.out.println("Your temperature is : " + cel + "C");
        input.close();
    }
}
