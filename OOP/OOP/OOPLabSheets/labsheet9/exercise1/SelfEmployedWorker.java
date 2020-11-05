package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee{

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName,lastName);

    }

    public void setEstimatedIncome(){
        estimatedIncome=(int)(Math.random()*501)+400;

    }

    public double earnings(){
        return estimatedIncome;


    }

    public String toString(){

        return "Self-employed workers name is "+super.toString();

    }


}
