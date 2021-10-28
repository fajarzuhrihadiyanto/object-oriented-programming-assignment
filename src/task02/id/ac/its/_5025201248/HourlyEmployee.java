package task02.id.ac.its._5025201248;

import task02.id.ac.its._5025201248.generic.Employee;

/**
 * Class HourlyEmployee represents hourly paid employee.
 * This class is an implementation of {@link Employee}
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public class HourlyEmployee extends Employee {

    /** Field to contain hourly pay of the employee in USD */
    private double wage;

    /** Field to contain total working hours per week of the employee */
    private double hours;

    /**
     * Constructor to initialize new hourly pay employee.
     *
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param ssn social security number of the employee
     * @param wage hourly pay of the employee in USD
     * @param hours total working hours per week of the employee
     * */
    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        /* call super constructor */
        super(firstName, lastName, ssn);

        /*
         * Using setter to set the wage and hours
         * in order to pass some validation
         * */
        this.setWage(wage);
        this.setHours(hours);
    }

    /**
     * This is getter method for field {@link #wage}
     *
     * @return double type data represents hourly pay of the employee
     * */
    public double getWage() {
        return wage;
    }

    /**
     * This is setter method for field {@link #wage}.
     * There is additional validation for the only argument,
     * which is the argument must be non negative number (>= 0.0)
     *
     * @param wage hourly pay of the employee
     * @throws IllegalArgumentException when hourly pay is a negative number
     * */
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be non negative number");
        }
        this.wage = wage;
    }

    /**
     * This is getter method for field {@link #hours}
     *
     * @return double type data represents total working hours per week of the employee
     * */
    public double getHours() {
        return hours;
    }

    /**
     * This is setter method for field {@link #hours}.
     * There is additional validation for the only argument,
     * which is the argument must be between 0 and 168 (inclusive)
     *
     * @param hours total working hour per week of the employee
     * @throws IllegalArgumentException when the argument is out of range (0 - 168)
     * */
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0 (inclusive)");
        }
        this.hours = hours;
    }

    /**
     * This method returns earnings of the employee based on some condition :
     * <ul>
     *     <li>
     *         If the employee works no longer than 40 hours a week, the formula is :
     *         {@link #wage} * {@link #hours}
     *     </li>
     *     <li>
     *         If the employee works longer than 40 hours a week, the formula is :
     *         (40 * {@link #wage}) + (({@link #hours} - 40) * {@link #wage} * 1.5)
     *     </li>
     * </ul>
     *
     * @return earnings of the employee
     * */
    @Override
    public double earnings() {
        if (hours <= 40.0) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }

    /**
     * Override toString method from class {@link Employee}
     *
     * @return string with this format :
     * <pre>hourly employee : {@link #firstName} {@link #lastName}
     * <br/>social security number : {@link #ssn}
     * <br/>hourly wage : ${@link #wage}; hours worked : {@link #hours}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "%s : %s %s\n%s : %s\n%s : $%,.2f; %s : %.2f\n",
                "hourly employee", firstName, lastName,
                "social security number", ssn,
                "hourly wage", wage, "hours worked", hours
        );
    }
}
