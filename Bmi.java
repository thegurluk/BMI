import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("please enter your height(meter):");
        Scanner input=new Scanner(System.in);
        double meter= input.nextDouble();
        System.out.println("please enter your weight(kg):");
        double kg=input.nextDouble();
        double bmi=kg/(meter*meter);
        System.out.println("Your BMI is:"+bmi);
        String result=(bmi>25) ? "obese" : "normal";
        System.out.println("you are "+result+" for BMI ");
    }
}
