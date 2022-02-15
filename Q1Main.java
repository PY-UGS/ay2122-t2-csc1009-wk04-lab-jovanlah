import java.util.Scanner;

public class Q1Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = in.nextDouble();        

        Q1BMI bmi1 = new Q1BMI(weight, height);

        System.out.printf("BMI is %.15f\n", bmi1.computeBMI());
        bmi1.computeInterpretation();   //Interpretation
        in.close();
    }
}
