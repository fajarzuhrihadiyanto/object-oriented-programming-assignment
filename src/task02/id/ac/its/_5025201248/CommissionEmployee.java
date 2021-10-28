package task02.id.ac.its._5025201248;

import task02.id.ac.its._5025201248.generic.Employee;

/**
 * Class CommissionEmployee represents commission employee.
 * This class is an implementation of {@link Employee}
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public class CommissionEmployee extends Employee {

    /** Field to contain commission rate of the employee */
    protected double commissionRate;

    /** Field to contain gross sales of the employee is USD */
    protected double grossSales;

    /**
     * Constructor to initialize new commission employee.
     *
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param ssn social security number of the employee
     * @param commissionRate commission rate of the employee
     * @param grossSales gross sales of the employee
     * */
    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales) {
        super(firstName, lastName, ssn);
        this.setCommissionRate(commissionRate);
        this.setGrossSales(grossSales);
    }

    /**
     * This is getter method for field {@link #commissionRate}
     *
     * @return double type data represents commission rate of the employee
     * */
    public double getCommissionRate() {
        return commissionRate;
    }

    /**
     * This is setter method for field {@link #commissionRate}.
     * There is additional validation for the only argument,
     * which is the argument must be between 0.0 and 1.0 (exclusive)
     *
     * @param commissionRate commission rate of the employee
     * @throws IllegalArgumentException when commission rate is out of range (0 - 1)
     * */
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission Rate must be between 0.0 and 1.0 (exclusive)");
        }
        this.commissionRate = commissionRate;
    }

    /**
     * This is getter method for field {@link #grossSales}
     *
     * @return double type data represents gross sales of the employee
     * */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * This is setter method for field {@link #grossSales}.
     * There is additional validation for the only argument,
     * which is the argument must be non negative number (>= 0.0)
     *
     * @param grossSales gross sales of the employee
     * @throws IllegalArgumentException when gross sales is a negative number
     * */
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be non negative number");
        }
        this.grossSales = grossSales;
    }

    /**
     * This method returns earnings of the employee with this formula :
     * {@link #commissionRate} * {@link #grossSales}
     *
     * @return earnings of the employee
     * */
    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    /**
     * Override toString method from class {@link Employee}
     *
     * @return string with this format :
     * <pre>commission employee : {@link #firstName} {@link #lastName}
     * <br/>social security number : {@link #ssn}
     * <br/>gross sales : ${@link #grossSales}
     * <br/>commission rate : {@link #commissionRate}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "%s : %s %s\n%s : %s\n%s : $%,.2f\n%s : %.2f\n",
                "commission employee", firstName, lastName,
                "social security number", ssn,
                "gross sales", grossSales,
                "commission rate", commissionRate
        );
    }
}
