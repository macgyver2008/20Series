public class Bike extends Vehicle {

    /**
     * Pedalling cadence.
     */
    private int cadence;

    /**
     * Current gear.
     */
    private int gear;

    /**
     * Constructs a Bike object.
     *
     * @param color
     * @param maximumSpeed
     * @param gear
     */
    public Bike(final String color,
                final int maximumSpeed,
                final int gear) {
        super(color, "N/A", 0, maximumSpeed);
        this.gear = gear;
        this.cadence = 0;
    }

    /**
     * Overrides Vehicle accelerate method.
     *
     * @param appliedPower
     * @param newGear
     * @return speed
     */
    @Override
    public void accelerate(final int appliedPower,
                           final int newGear) {
        gear = newGear;
        cadence = cadence + appliedPower;
        speed = speed + (cadence * gear);

        if (speed > maximumSpeed) {
            speed = maximumSpeed;
        }
        return speed;
    }

    /**
     * Rings the bike bell.
     *
     * @return bell sound
     */
    public String ringBell() {
        return "Ding ding!\n";
    }
}
