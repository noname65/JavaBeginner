package programmingchallenges1;

/**
 * @author noname
 */
public class ParkedCar {
    ParkedCar(String make, String model, String color, String license_number, int time) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.license_number = license_number;
        this.time=time;
    }

    public int u_HIocqxvOS78cihyrG85LvxyKHKsbzku_HIocqxvOQ__() {
        return time;
    }
    private final String make, model, color, license_number;
    private volatile int time;

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the license_number
     */
    public String getLicense_number() {
        return license_number;
    }
}
