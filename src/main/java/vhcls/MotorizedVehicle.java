package vhcls;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class MotorizedVehicle implements Vehicles{

    //TODO Add all constructor parameters to the constructor
    /*
    Constructor parameter
     */
    private final String CHASSIS_NUMBER;
    private final VehicleType TYPE;
    private final LocalDate INITIAL_REGISTRATION_DATE;
    private String registeredCountry;
    private String owner;
    private String numberPlate;
    private int maxSpeed;
    private int weight;

    /*
    Additional parameter
     */

    private String mainDriver;
    private LinkedList<String> drivers = new LinkedList<>();


    /**
     * Constructor has to be called with public method loadVehicle or newVehicle
     * @param chassisNumber The official identification number of the vehicle
     */
    protected MotorizedVehicle(String chassisNumber, VehicleType TYPE, LocalDate initialRegistrationDate,
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
    public static MotorizedVehicle newVehicle(EngineType engineType, String chassisNumber, VehicleType type,
                                              LocalDate initialRegistrationDate, String registeredCountry,
                                              String owner, String numberPlate,
                                              int maxSpeed, int weight) throws IllegalArgumentException {
        switch (engineType) {
            case ELECTRIC -> {
                return ElectricVehicle.newVehicle();
            }
            case HYBRID -> throw new IllegalArgumentException("[" + MotorizedVehicle.class.getName() +
                    "]:  Hybrid Vehicle Type not supported");
            default -> {
                new MotorizedVehicle(chassisNumber, type, initialRegistrationDate,
                        registeredCountry, owner, numberPlate,maxSpeed,weight);
            }
        }
        System.out.println("Checkpot!");
        return new MotorizedVehicle(chassisNumber, type, initialRegistrationDate,
                registeredCountry, owner, numberPlate,maxSpeed,weight);
    }

    /**
     * Method to load an existing vehicle. Method requires only one parameter, the other one can be null
     *
     * @param chasisNumber The official chassis Number of the vehicle
     * @param numberPlate
     * @return
     */
    public MotorizedVehicle loadVehicle(String chasisNumber, String numberPlate) {
        return null;
    }

    /**
     * @param chasisNumber
     * @param numberPlate
     * @return
     */
    public boolean deleteVehicle(String chasisNumber, String numberPlate) {
        return false;
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
     * Method to get the owner of the vehicle, first and last name seperated by a +
     * @return Owner of the vehicle as String
     */
    @Override
    public String getOwner() {
        return this.owner;
    }

    /**
     * Method to set the owner of the vehicle
     * @param ownerFirstName Requires a String. Set the first name of the owner
     * @param ownerLastName  Requires a String. Set the last name of the owner
     */
    @Override
    public void setOwner(String ownerFirstName, String ownerLastName) {
        this.owner = ownerLastName + "+" + ownerFirstName;
    }

    /**
     * Method to get the maximum speed
     * @return Maximum speed as int
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Method to get the empty weight of the vehicle
     * @return Weight of vehicle as int
     */
    @Override
    public int getWeight() {
        return this.weight;
    }
}
