package vhcls;

/**
 * Class contains vehicle specific helper methods
 */
public class VehicleHelper {

    public static String numberPlateHelper(String country,String city, String plateSymbols){

        return city + "-" + plateSymbols;
    }
}
