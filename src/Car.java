public class Car {
    public int speed;
    public String colour, model, brand;
    public boolean trailer;

    public Car(int speed, String colour, String model, String brand, boolean trailer) {
        this.speed = speed;
        this.colour = colour;
        this.model = model;
        this.brand = brand;
        this.trailer = trailer;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Car)) {
            return false;
        }

        Car other = (Car) object;
        return speed == other.speed &&
                colour.equals(other.colour) &&
                model.equals(other.model) &&
                brand.equals(other.brand) &&
                trailer == other.trailer;
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                " Speed: " + speed +
                " Colour: " + colour +
                " Model: " + model +
                " Trailer: " + trailer;
    }

}
