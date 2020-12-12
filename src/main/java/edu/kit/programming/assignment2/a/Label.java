package edu.kit.programming.assignment2.a;

/**
 * A class representing a label with name, address and date of foundation.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Label {

    private final String name;
    private final Address address;
    private final Date dateOfFoundation;

    /**
     * Creates a new label with the provided values.
     * @param name name of the label.
     * @param address address of the label.
     * @param dateOfFoundation date of foundation of the label.
     */
    public Label(String name, Address address, Date dateOfFoundation) {
        this.name = name;
        this.address = address;
        this.dateOfFoundation = dateOfFoundation;
    }

    /**
     * Returns the name of the label.
     *
     * @return the label name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the label.
     *
     * @return the label address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Returns the date of foundation of the label
     *
     * @return date of foundation of the label
     */
    public Date getDateOfFoundation() {
        return dateOfFoundation;
    }
}
