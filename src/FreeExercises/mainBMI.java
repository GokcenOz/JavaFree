package FreeExercises;

import java.util.Scanner;

public class mainBMI {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your weight and height");
        double w=scan.nextDouble();
        double h= scan.nextDouble();

        BMI b=new BMI("ayse",23,w,h);

        System.out.println(b.getName()+" "+b.getAge()+" "+b.BMIresult()+" "+b.BMIcalculate());


    }
}
