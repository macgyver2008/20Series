public class Vehicle {

    /**
     * Color of the vehicle.
     */
    protected String color;

    /**
     * License plate number of the vehicle.
     */
    protected String licensePlateNumber;

    /**
     * Number of doors of the vehicle.
     */
    protected int doors;

    /**
     * Current speed of the vehicle.
     */
    protected int speed;

    /**
     * Maximum speed of the vehicle.
     */
    protected int maximumSpeed;

    /**
     * Constructs a Vehicle object.
     *
     * @param color
     * @param licensePlateNumber
     * @param doors
     * @param maximumSpeed
     */
    public Vehicle(final String color,
                   final String licensePlateNumber,
                   final int doors,
                   final int maximumSpeed) {
        this.color = color;
        this.licensePlateNumber = licensePlateNumber;
        this.doors = doors;
        this.maximumSpeed = maximumSpeed;
        this.speed = 0;
    }

    /**
     * Accelerates the vehicle.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public void accelerate(final int accelerationPower,
                           final int accelerationTime) {
        speed += power * time;
       if (speed <= maxSpeed) {
           return speed;
       } else {
           speed = maxSpeed;
           return speed;
       }
    }

    /**
     * Slows down the vehicle.
     *
     * @param brakePower the braking power
     * @param brakeTime the time of braking
     * @return speed
     */
    public void brake(final int brakePower,
                      final int brakeTime) {
        speed -= power * time;
       if (speed >= 0) {
           return speed;
       } else {
           speed = 0;
           return speed;
       }
    }

    /**
     * Prints the current status of the vehicle.
     */
    public void status() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("License plate number: " + licensePlateNumber);
        System.out.println("Max speed: " + maximumSpeed);
        System.out.println("Number of doors: " + doors);
    }

    /**
     * Returns the current speed.
     *
     * @return the current speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Returns the vehicle color.
     *
     * @return the vehicle color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets a new vehicle color.
     *
     * @param newColor the new color
     */
    public void setColor(final String newColor) {
        color = newColor;
    }
}
