package vehicles;

public abstract class Vehicle {

    private String model;
    private int price;
    private String colour;
    private int maxSpeed;

    public Vehicle(String model, int price, String colour, int maxSpeed){
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
