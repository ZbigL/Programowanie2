package pl.sdaacademy.intermediate.basic.basic4Sets;

public class Car {
    private String marka;
    private String model;
    private String VIN;

    public Car(String marka, String model, String VIN) {
        this.marka = marka;
        this.model = model;
        this.VIN = VIN;

    }

    public String getVIN() {
        return VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return VIN.hashCode();
    }
}
