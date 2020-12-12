package edu.kit.programming.assignment2.a;

/**
 * A class representing an address with a street name, a city and a postcode.
 *
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Address {

    private final String street;
    private final String city;
    private final int postcode;

    /**
     * Creates a new address initialized with the provided values.
     *
     * @param street The name of the street.
     * @param city The name of the city.
     * @param postcode The postcode of the address.
     */
    public Address(String street, String city, int postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    /**
     * Returns the street name associated with this address.
     *
     * @return The street name.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns the city name associated with this address.
     *
     * @return The city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the postcode associated with this address.
     *
     * @return The postcode.
     */
    public int getPostcode() {
        return postcode;
    }
}
