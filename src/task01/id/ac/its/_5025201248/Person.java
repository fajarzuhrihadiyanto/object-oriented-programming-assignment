package task01.id.ac.its._5025201248;

/**
 * class Person represents sender or receiver in this Package Application
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 20th 2021
 * */
public class Person {

    /** Field to contain name of the person */
    private String name;

    /** Field to contain number and street name of the address */
    private String address;

    /** Field to contain city part of the address */
    private String city;

    /** Field to contain state part of the address */
    private String state;

    /** Field to contain zip code part of the address */
    private String zipCode;

    /**
     * Constructor to initialize new person
     *
     * @param name person's name
     * @param address number and street name address
     * @param city city name of the address
     * @param state state name of the address
     * @param zipCode zip code of the address
     * */
    public Person(String name, String address, String city, String state, String zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * This is getter method for field {@link #name}
     *
     * @return field {@link #name}
     * */
    public String getName() {
        return name;
    }

    /**
     * This is setter method for field {@link #name}
     *
     * @param name name of the person
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This is getter method for field {@link #address}
     *
     * @return field {@link #address}
     * */
    public String getAddress() {
        return address;
    }

    /**
     * This is setter method for field {@link #address}
     *
     * @param address address of the person
     * */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This is getter method for field {@link #city}
     *
     * @return field {@link #city}
     * */
    public String getCity() {
        return city;
    }

    /**
     * This is setter method for field {@link #city}
     *
     * @param city city part of address of the person
     * */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This is getter method for field {@link #state}
     *
     * @return field {@link #state}
     * */
    public String getState() {
        return state;
    }

    /**
     * This is setter method for field {@link #state}
     *
     * @param state state part of address of the person
     * */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This is getter method for field {@link #zipCode}
     *
     * @return field {@link #zipCode}
     * */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This is setter method for field {@link #zipCode}
     *
     * @param zipCode zip code part of address of the person
     * */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Override method from class {@link Object}
     *
     * @return string with this format
     * <pre>name     : {@link #name}
     * <br/>address  : {@link #address}
     * <br/>           {@link #city}, {@link #state}
     * <br/>           {@link #zipCode}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "name\t: %s\n" +
                "address\t: %s\n" +
                "\t\t  %s, %s\n" +
                "\t\t  %s\n",
                name, address, city, state, zipCode);
    }
}
