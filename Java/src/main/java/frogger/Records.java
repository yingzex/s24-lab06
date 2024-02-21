package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param firstName   first name of the frogger
     * @param lastName    last name of the frogger
     * @param phoneNumber phone number of the frogger
     * @param zipCode     zip code of the frogger
     * @param state       state of the frogger
     * @param gender      gender of the frogger
     * @return Return false if the record has existed. Else, return true.
     */
    // Long parameter list: a long list of parameters provided to a method.
    public boolean addRecord(String firstName, String lastName, String phoneNumber,
            String zipCode, String state, String gender) {
        FroggerID newRecord = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
        for (FroggerID row : this.records) {
            if (row.equals(newRecord)) {
                return false;
            }
        }
        this.records.add(newRecord);
        return true;
    }
}