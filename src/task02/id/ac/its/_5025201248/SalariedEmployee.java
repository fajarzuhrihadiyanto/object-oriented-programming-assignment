package task02.id.ac.its._5025201248;

import task02.id.ac.its._5025201248.generic.Employee;

/**
 * Class SalariedEmployee represents weekly salaried employee.
 * This class is an implementation of {@link Employee}
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public class SalariedEmployee extends Employee {

    /** Field to contain weekly salary of the employee in USD */
    private double weeklySalary;

    /**
     * Constructor to initialize new weekly salaried employee.
     *
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param ssn social security number of the employee
     * @param weeklySalary weekly salary of the employee in USD
     * */
    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        /* call super constructor */
        super(firstName, lastName, ssn);

        /*
         * Using setter to set the weekly salary
         * in order to pass some validation
         * */
        this.setWeeklySalary(weeklySalary);
    }

    /**
     * This is getter method for field {@link #weeklySalary}
     *
     * @return double type data represents weekly salary of the employee
     * */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * This is setter method for field {@link #weeklySalary}.
     * There is additional validation for the only argument,
     * which is the argument must be non negative number (>= 0.0)
     *
     * @param weeklySalary weekly salary of the employee
     * @throws IllegalArgumentException when weekly salary is a negative number
     * */
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be non negative number");
        }
        this.weeklySalary = weeklySalary;
    }

    /**
     * This method returns earnings of the employee with this formula :
     * {@link #weeklySalary}
     *
     * @return earnings of the employee
     * */
    @Override
    public double earnings() {
        return weeklySalary;
    }

    /**
     * Override toString method from class {@link Employee}
     *
     * @return string with this format :
     * <pre>salaried employee : {@link #firstName} {@link #lastName}
     * <br/>social security number : {@link #ssn}
     * <br/>weekly salary : ${@link #weeklySalary}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "%s : %s %s\n%s : %s\n%s : $%,.2f\n",
                "salaried employee", firstName, lastName,
                "social security number", ssn,
                "weekly salary", weeklySalary
        );
    }
}
