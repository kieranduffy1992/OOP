package labsheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {

        String text="";

        Car car1 = new Car();

        System.out.println("Testing the Car no-arg constructor:"+car1);

        Car car2 = new Car(1000000,4.5,1.25,2000,"Ferrari","F2",2,"05KY123");

        System.out.println("\n\nTesting the Car multi-arg constructor:"+car2);

        Bicycle bicycle1 = new Bicycle();

        System.out.println("\n\nTesting the Bicycle no-arg constructor:"+bicycle1);

        Bicycle bicycle2 = new Bicycle(500,1.5,1.0,50,"Raleigh","Mountain Bike",true,4);

        System.out.println("\n\nTesting the Bicycle multi-arg constructor:"+bicycle2);






    }
}
