package task02.id.ac.its._5025201248.generic;

/**
 * Class Employee represents general employee.
 * This class is an abstraction of some types of employees
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public abstract class Employee {

    /** Field to contain first name of the employee */
    protected String firstName;

    /** Field to contain last name of the employee */
    protected String lastName;

    /** Field to contain social security number of the employee */
    protected String ssn;

    /**
     * Constructor to initialize new employee.
     * This constructor is just for generalization, not instantiation
     *
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param ssn social security number of the employee
     * */
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    /**
     * This is getter method for field {@link #firstName}
     *
     * @return field {@link #firstName}
     * */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is setter method for field {@link #firstName}
     *
     * @param firstName first name of the employee
     * */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is getter method for field {@link #lastName}
     *
     * @return field {@link #lastName}
     * */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is setter method for field {@link #lastName}
     *
     * @param lastName first name of the employee
     * */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is getter method for field {@link #ssn}
     *
     * @return field {@link #ssn}
     * */
    public String getSsn() {
        return ssn;
    }

    /**
     * This is setter method for field {@link #ssn}
     *
     * @param ssn first name of the employee
     * */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * This is an abstract method to calculate and return earnings of the employee based on their type
     *
     * @return double type data represents earnings of the employee
     * */
    public abstract double earnings();

    /**
     * Override toString method from class {@link Object}
     *
     * @return string with this format :
     * <pre>{@link #firstName} {@link #lastName}
     * <br/>social security number : {@link #ssn}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "%s %s\n%s : %s",
                firstName, lastName,
                "social security number", ssn
        );
    }
}
