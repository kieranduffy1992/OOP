package labsheet1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        final double g = 9.81;
        double massEarth, radiusEarth, massPlanet, radiusPlanet, accerleration;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet earth: ");
        massEarth = input.nextDouble();
        System.out.print("Please enter the radius of planet earth: ");
        radiusEarth = input.nextDouble();
        System.out.print("Please enter the mass of other planet: ");
        massPlanet = input.nextDouble();
        System.out.print("Please enter the radius of other planet: ");
        radiusPlanet = input.nextDouble();

        accerleration = ((g*massPlanet)*(radiusEarth*radiusEarth))/massEarth*(radiusPlanet*radiusPlanet);

        System.out.println("The acceleration due to gravity on the other planet is " + String.format("%.2f",accerleration) + "m/s/s");


    }
}
