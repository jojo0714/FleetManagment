package vhcls;

import java.time.LocalDate;
import java.util.LinkedList;

public class MotorizedVehicle implements Vehicles{
    /*
    Constructor parameter
     */
    private final String CHASSIS_NUMBER;
    private final VehicleType TYPE;
    private final LocalDate INITIAL_REGISTRATION_DATE;
    private String registeredCountry = null;
    private String owner;
    private String numberPlate;
    private int maxSpeed;
    private int weight;

    /*
    Additional parameter
     */

    String mainDriver;
    LinkedList<String> drivers = new LinkedList<>(null);
    /**
     * Constructor has to be called with public method loadVehicle or newVehicle
     * @param chassisNumber The official identification number of the vehicle
     */
    private MotorizedVehicle(String chassisNumber, VehicleType TYPE, LocalDate initialRegistrationDate,
                             String registeredCountry, String owner, String numberPlate, int maxSpeed, int weight) {
        this.CHASSIS_NUMBER = chassisNumber;
        this.TYPE = TYPE;
        this.INITIAL_REGISTRATION_DATE = initialRegistrationDate;
        this.registeredCountry = registeredCountry;
        this.numberPlate = numberPlate;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    /**
     * Method to create a new vehicle
     * @param chassisNumber Official chassis number
     * @param type
     * @param initialRegistrationDate
     * @param registeredCountry
     * @param owner
     * @param numberPlate
     * @param maxSpeed
     * @param weight
     * @return
     */
    public MotorizedVehicle newVehicle(String chassisNumber, VehicleType type, LocalDate initialRegistrationDate,
                                       String registeredCountry, String owner, String numberPlate, int maxSpeed, int weight) {
        return new MotorizedVehicle(chassisNumber, type, initialRegistrationDate,
                registeredCountry, owner, numberPlate,maxSpeed,weight);
    }

    /**
     * Method to get the ident number of the vehicle
     *
     * @return Ident number as String
     */
    @Override
    public String getChassisNumber() {
        return this.CHASSIS_NUMBER;
    }

    /**
     * Method to get the number plate of the vehicle
     *
     * @return Number plate as String
     */
    @Override
    public String getNumberPlate() {
        return this.numberPlate;
    }

    /**
     * Method to change the number plate
     *
     * @param country     Requires the country code as String
     * @param city        Requires the city code as String
     * @param numberPlate Requires the number plate without city or country code as String
     */
    @Override
    public void setNumberPlate(String country, String city, String numberPlate) {
        registeredCountry = country;
        this.numberPlate =city + "-" + numberPlate;
    }

    /**
     * Method to get the typ of the vehicle
     *
     * @return Typ of vehicle as VehicleTyp
     */
    @Override
    public VehicleType getType() {
        return this.TYPE;
    }

    /**
     * Method to get the initial registration date of the vehicle
     *
     * @return Initial registration date as LocalDate
     */
    @Override
    public LocalDate getInitialRegistrationDate() {
        return this.INITIAL_REGISTRATION_DATE;
    }

    /**
     * Method to get the owner of the vehicle
     *
     * @return Owner of the vehicle as String
     */
    @Override
    public String getOwner() {
        return this.owner;
    }

    /**
     * Method to set the owner of the vehicle
     *
     * @param ownerFirstName Requires a String. Set the first name of the owner
     * @param ownerLastName  Requires a String. Set the last name of the owner
     */
    @Override
    public void setOwner(String ownerFirstName, String ownerLastName) {
    }

    /**
     * Method to get the maximum speed
     *
     * @return Maximum speed as int
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Method to get the empty weight of the vehicle
     *
     * @return Weight of vehicle as int
     */
    @Override
    public int getWeight() {
        return this.weight;
    }
}
