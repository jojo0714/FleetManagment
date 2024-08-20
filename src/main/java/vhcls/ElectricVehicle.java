package vhcls;

public class ElectricVehicle extends MotorizedVehicle implements Vehicles{

    ElectricVehicle() {
        super(null,null,null,null,null,null,0,0);

    }

    /**
     * Method to create a new electric vehicle
     * @return
     * @throws IllegalAccessError
     */
    public static ElectricVehicle newVehicle()throws IllegalAccessError{
        throw new IllegalAccessError("Class not implemented");
    }

}
