public class Engine {
    private String type;
    private int capacity;
    private FuelType fuelType;

    private int fullness;


    public Engine(){

    }
    public Engine(String type, int capacity, FuelType fuelType, int fullness) {
        this.type = type;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.fullness = fullness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public void fueling(int byFuel, PetrolStation petrolStation) {
        int newFullness = this.fullness + byFuel;
        if (newFullness <= capacity) {
            this.fullness = newFullness;
            System.out.println("Fueling successful!");
            petrolStation.setPetrolAmount(petrolStation.getPetrolAmount() - byFuel);
        } else {
            int overflow = newFullness - capacity;
            this.fullness = capacity;
            System.out.println("Maximum capacity reached! Overflow: " + overflow + " liters spilled on the ground!");
            petrolStation.setPetrolAmount(petrolStation.getPetrolAmount() - (byFuel - overflow));
        }
    }




}
