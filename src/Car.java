public class Car implements Movable{

    private String colour;
    private String make;
    private Tire[] tires;
    private Engine engine;


    public void start(){
        boolean allTiresOk = true;
        for (int i = 0; i < tires.length; i++) {
            if (tires[i].getPressure() < 32){
                System.out.println("Tire #" + (i+1) + " is too low to start the car!");
                allTiresOk = false;
            }
        }
        if (allTiresOk){
            System.out.println("The car is ready to start!");
        }

        boolean fuelLevelIsOk = true;
        for (int i = 0; i < engine.getCapacity(); i++) {
            if (engine.getFullness() == 0){
                System.out.println("The car is out of fuel!");
                break;
            }
            else if (engine.getFullness() < 5){
                System.out.println("The fuel capacity is on low, go to petrol station or get fuel!");
                fuelLevelIsOk = false;
                break;
            }
        }
        if (fuelLevelIsOk && engine.getFullness() != 0){
            System.out.println("The car is running!");
        }


    }

    public void stop(){
        System.out.println("The car is stopped!");
    }



    public Car(){

    }
    public Car(String colour, String make, Tire[] tires, Engine engine) {
        this.colour = colour;
        this.make = make;
        this.tires = tires;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public void moveForward() {
        Engine engine = this.getEngine();
        int currentFuelness = engine.getFullness();

        if (currentFuelness <= 0) {
            System.out.println("Out of fuel!");
            return;
        }

        int newFuelness = Math.max(currentFuelness - 1, 0);
        engine.setFullness(newFuelness);
        System.out.println("The car is moving forward! Current fuel level: " + currentFuelness + " liter");

        if (newFuelness == 0) {
            stop();
            System.out.println("Out of fuel!");
        } else if (newFuelness < 5) {
            System.out.println("Low on petrol! Current fuel level: " + newFuelness + " liter");
        }
    }
}
