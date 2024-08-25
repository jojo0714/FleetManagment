import java.util.UUID;
import dtio.Reader;
public class IDManagement {

    /**
     * Method to create a new uuid
     * @param data String from which the id should be build
     * @return An uuid
     */
    public static UUID createID(String data) throws IllegalArgumentException { //TODO Remove Exception
        UUID id = UUID.fromString(data);

        if(Reader.exist(id)){
            return id;
        }else{
            //TODO Write some code for this case and remove Exception
            throw new IllegalArgumentException("Resulting UUID is not unique. Please check for double data");
        }
    }

    /**
     * Method to create a new uuid
     * @return An uuid
     */
    public static UUID createID(){
        return UUID.randomUUID();
    }
}
