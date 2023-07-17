public class Fuel {
    private int fuelLiter;
    private FuelType fuelType;

    public Fuel(){

    }

    public Fuel(int fuelLiter, FuelType fuelType) {
        this.fuelLiter = fuelLiter;
        this.fuelType = fuelType;
    }

    public int getFuelLiter() {
        return fuelLiter;
    }

    public void setFuelLiter(int fuelLiter) {
        this.fuelLiter = fuelLiter;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
