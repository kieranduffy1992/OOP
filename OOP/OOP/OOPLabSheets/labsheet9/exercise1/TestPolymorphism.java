package labsheet9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee allEmployees[] = new Employee[3];

        Employee employeeRef1, employeeRef2, employeeRef3; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        SelfEmployedWorker se1 = new SelfEmployedWorker("Kieran","Duffy");

        employeeRef1=b1; //recall a Boss "is a" Employee so this assignment is allowed
        employeeRef2=hw1;
        employeeRef3=se1;

        allEmployees[0]=employeeRef1;
        allEmployees[1]=employeeRef2;
        allEmployees[2]=employeeRef3;

        for(int i=0;i< allEmployees.length;i++)
        {
            System.out.print(allEmployees[i] +" "+ String.format("%.2f",allEmployees[i].earnings())+"\n\n");
        }
    }
}