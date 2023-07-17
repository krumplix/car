public class PetrolStation {
    private int petrolAmount;

    public PetrolStation(int initialPetrolAmount){
        this.petrolAmount = initialPetrolAmount;
    }

    public PetrolStation(){

    }

    public void refuelCar(Car car, int amount){
        if (petrolAmount >= amount){
            car.getEngine().fueling(amount, this);
            petrolAmount -= amount;
            System.out.println("Car refueled with " + amount + " liters of petrol.");
        }else {
            System.out.println("Not enough petrol in the petrol station.");
        }
    }
    public int getPetrolAmount(){
        return petrolAmount;
    }

    public void setPetrolAmount(int petrolAmount){
        this.petrolAmount = petrolAmount;
    }


}
