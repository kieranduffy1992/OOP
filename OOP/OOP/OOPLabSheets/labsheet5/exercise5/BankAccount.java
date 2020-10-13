package labsheet5.exercise5;

public class BankAccount {
    private String owner;
    private static int number;
    private static double interestRate;


    public BankAccount(){

        setOwner("Owner not available");
        setInterestRate(0.0);
        incrementNumber();
        setNumber(number);

    }

    public BankAccount(String owner, double interestRate){

        setOwner(owner);
        setInterestRate(interestRate);
        incrementNumber();
        setNumber(number);


    }

    public void setOwner(String owner){
        this.owner = owner;

    }

    public void setNumber(int number){
        this.number = number;

    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public String getOwner(){
        return owner;
    }



    private static void incrementNumber(){
        number++;
    }

    private static int getNumber(){
        return number;

    }

    public static double getInterestRate() {
        return interestRate;
    }

    public String toString(){
        return "\n\nOwner: " +getOwner()+ " Account Number: " +getNumber()+ " Interest Rate: " +getInterestRate();

    }
}
