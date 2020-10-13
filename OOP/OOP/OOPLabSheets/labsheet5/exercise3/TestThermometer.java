package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        int currentTemperature;
        String output="*****Thermometer Testing*****";

        Thermometer thermometer1 = new Thermometer(35);

        output += "\n\nCalling the single-argument constructor....setting the temperature of the first " +
                "thermometer to " + thermometer1.getCurrentTemperature() + "\nFirst Thermometer:" + thermometer1.toString();

        Thermometer thermometer2 = new Thermometer();

        output += "\n\nCalling the no-argument constructor....setting the temperature of the second " +
                "thermometer to " + thermometer2.getCurrentTemperature() + "\nSecond Thermometer:" + thermometer2.toString();

        thermometer2.setTemperature(25);

        output += "\n\nCalling setTemperature()....setting the temperature of second thermometer to " +
                thermometer2.getCurrentTemperature() + "\nSecond Thermometer:" + thermometer2.toString();


        JOptionPane.showMessageDialog(null,output,"Thermometer Testing",
                JOptionPane.INFORMATION_MESSAGE);

        currentTemperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:"));

        thermometer1.setTemperature(currentTemperature);

        JOptionPane.showMessageDialog(null,"Calling setTemperature()....setting the temperature of the first thermometer to " + currentTemperature +
                "\nFirst Thermometer:" + thermometer1.toString());

        System.exit(0);


    }

}
