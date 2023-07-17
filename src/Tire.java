public class Tire {
    private int pressure;
    private String colour;
    private int diameter;
    private String treadType;

    public Tire(){

    }

    public Tire(int pressure, String colour, int diameter, String treadType) {
        this.pressure = pressure;
        this.colour = colour;
        this.diameter = diameter;
        this.treadType = treadType;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getTreadType() {
        return treadType;
    }

    public void setTreadType(String treadType) {
        this.treadType = treadType;
    }

    public void inflate(int bypounds) {
        this.pressure = bypounds;
    }

    public void deflate(int bypounds) {
        this.pressure = bypounds;
    }
}
