package vhcls;

import java.time.LocalDate;

/**
 * Interface which defines what attributes each vehicle has
 */
public interface Vehicles {

    /**
     * Method to get the ident number of the vehicle
     * @return Ident number as String
     */
    String getChassisNumber();

    /**
     * Method to get the number plate of the vehicle
     * @return Number plate as String
     */
    String getNumberPlate();

    /**
     * Method to change the number plate
     * @param country Requires the country code as String
     * @param city Requires the city code as String
     * @param numberPlate Requires the number plate without city or country code as String
     */
    void setNumberPlate(String country, String city,String numberPlate);

    /**
     * Method to get the typ of the vehicle
     * @return Typ of vehicle as VehicleTyp
     */
    VehicleType getType();

    /**
     * Method to get the initial registration date of the vehicle
     * @return Initial registration date as LocalDate
     */
    LocalDate getInitialRegistrationDate();

    /**
     * Method to get the owner of the vehicle
     * @return Owner of the vehicle as String
     */
    String getOwner();

    /**
     * Method to set the owner of the vehicle
     * @param ownerFirstName Requires a String. Set the first name of the owner
     * @param ownerLastName Requires a String. Set the last name of the owner
     */
    void setOwner(String ownerFirstName, String ownerLastName);

    /**
     * Method to get the maximum speed
     * @return Maximum speed as int
     */
    int getMaxSpeed();

    /**
     * Method to get the empty weight of the vehicle
     * @return Weight of vehicle as int
     */
    int getWeight();

}
