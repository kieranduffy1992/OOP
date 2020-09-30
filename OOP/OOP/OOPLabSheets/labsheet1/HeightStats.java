package labsheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        float height, totalHeights=0,smallestHeight=0,average;
        int counter=1, between1_3And1_9=0, exceedAverage=0;
        final float GLOBAL_AVERAGE_HEIGHT=1.665f;

        Scanner input = new Scanner(System.in);

        while(counter<=6)
        {

            System.out.print("Loop "+counter+" - Please enter height: ");
            height = input.nextFloat();

            while(height < 0.5464 || height > 2.72)
            {
                System.out.print("Loop "+counter+" - Height value invalid!!! Please enter height: ");
                height = input.nextFloat();
            }

            if(counter == 1)
            {
                smallestHeight = height;
            }

            else if(height < smallestHeight)
            {
                smallestHeight = height;
            }

            if(height > 1.3 && height < 1.9)
            {
                between1_3And1_9++;
            }

            totalHeights+=height;

            if(height > GLOBAL_AVERAGE_HEIGHT)
            {
                exceedAverage++;
            }

            counter++;
        }

        average = totalHeights/counter;

        System.out.println("----------------\n\t\tHeight Statistics\n----------------"+
                "\n\nThe average of the heights entered is "+String.format("%.2f",average)+"m"+"\nThe smallest height value entered is "+String.format("%.2f",smallestHeight)+
                "m"+"\nThe number of height values between 1.3m and 1.9m is "+between1_3And1_9 +
                "\nThe percentage of height values exceeding the global average height is "+String.format("%.2f",(float)exceedAverage/counter*100)+"%");

    }
}
