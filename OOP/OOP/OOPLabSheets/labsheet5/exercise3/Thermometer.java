package labsheet5.exercise3;

public class Thermometer {
    private int currentTemperature;
    private int maxTemperature;
    private int minTemperature;

    public Thermometer(){
        setTemperature(0);
        setMaxTemperature(Integer.MIN_VALUE);
        setMinTemperature(Integer.MAX_VALUE);

    }

    public Thermometer(int temperature){
        setCurrentTemperature(temperature);
        setMaxTemperature(temperature);
        setMinTemperature(temperature);


    }

    public int getCurrentTemperature(){
        return currentTemperature;

    }

    public int getMaxTemperature(){
        return maxTemperature;

    }

    public int getMinTemperature(){
        return minTemperature;

    }

    public void setCurrentTemperature(int currentTemperature){
        this.currentTemperature = currentTemperature;

    }

    public void setMaxTemperature(int maxTemperature){
        this.maxTemperature = maxTemperature;

    }

    public void setMinTemperature(int minTemperature){
        this.minTemperature = minTemperature;

    }

    public void setTemperature(int Temperature){
        currentTemperature = Temperature;

        updateMaxMinTemp(Temperature);
    }

    private void updateMaxMinTemp(int currentTemperature){

        if(currentTemperature > getMaxTemperature())
        {
            setMaxTemperature(currentTemperature);
        }

        if(currentTemperature < getMinTemperature())
        {
            setMinTemperature(currentTemperature);
        }


    }

    public String toString(){

        return "\nCurrent Temperature: " + getCurrentTemperature() + "\nMaximum Temperature: " +
                getMaxTemperature() + "\nMinimum Temperature: " +getMinTemperature();
    }

}
