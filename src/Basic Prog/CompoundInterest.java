import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your Principle Amount : ");
        float principle = input.nextFloat();
        System.out.println("now, tell me your rate of interest : ");
        float rate = input.nextFloat();
        System.out.println("Now, tell me how many years are you borrrowing : ");
        float years = input.nextFloat();

        double CompInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your Compound interest is : " + CompInt);
        input.close();
    }
}
