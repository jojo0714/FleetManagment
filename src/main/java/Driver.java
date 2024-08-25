import dtio.Reader;

import java.util.UUID;

public class Driver {

    private String name;

    public static String getName(UUID staffID){
        String name = Reader.getValueFromID(staffID);
    }
}
