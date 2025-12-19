public class Truck extends Vehicle {

    /**
     * Constructs a Truck object.
     *
     * @param color
     * @param licensePlateNumber 
     * @param maximumSpeed
     */
    public Truck(final String color,
                 final String licensePlateNumber,
                 final int maximumSpeed) {
        super(color, licensePlateNumber, 2, maximumSpeed);
    }

    /**
     * Reduces the truck's speed by releasing air pressure.
     *
     * @param airPressure
     * @return speed
     */
    public void provideAir(final int airPressure) {
        speed = speed - airPressure / 2;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }
}
