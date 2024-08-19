import vhcls.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        final String CHASSIS_NUMBER = "6UH283699JNSUW";
        final VehicleType TYPE = VehicleType.CAR;
        final LocalDate INITIAL_REGISTRATION_DATE =  LocalDate.now(); //LocalDate.of(2020,1,1);
        String registeredCountry = "DE";
        String owner = "JOHN DOE";
        String city = "AA";
        String numberPlate = VehicleHelper.numberPlateHelper(registeredCountry,city, "JB 007");
        int maxSpeed = 999;
        int weight = 1000;

        Vehicles vehicle = MotorizedVehicle.newVehicle(EngineType.DIESEL,CHASSIS_NUMBER,TYPE,INITIAL_REGISTRATION_DATE,
                registeredCountry,owner,numberPlate, maxSpeed,weight);

        System.out.println(vehicle.getChassisNumber());
        System.out.println(vehicle.getType());
        System.out.println(vehicle.getNumberPlate());
    }
}
