package insp;

import java.time.LocalDate;

public interface Inspection {
    /**
     * Method to get date of last Inspection
     * @return Date of last inspection as LocalDate
     */
    LocalDate getLastInspection();

    /**
     * Method to get date of next inspection
     * @return Date of next inspection as LocalDate
     */
    LocalDate getNextInspection();

    /**
     * Method to knew is the inspection valid or not
     * @return true if valid, false if not
     */
    boolean isValid();

    /**
     * Method to know how many years allowed between two inspections
     * @return
     */
    double getInspectionFrequency();

}
