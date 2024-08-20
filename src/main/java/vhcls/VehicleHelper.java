package vhcls;

/**
 * Class contains vehicle specific helper methods
 */
public class VehicleHelper {

    /**
     * Method creates a valid numberplate. Patern: country-city-numberplate
     * @param country Official country code on a numberplate
     * @param city city code on number plate
     * @param plateSymbols The symbols of the number plate
     * @return
     */
    public static String numberPlateHelper(String country,String city, String plateSymbols) throws IllegalArgumentException{
        if(country.equals("D")){
            return country + "-" + city + "-" + plateSymbols;
        }

        throw new IllegalArgumentException("Only Germany is supported yet");
    }
}
