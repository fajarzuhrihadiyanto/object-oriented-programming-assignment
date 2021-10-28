package task02.id.ac.its._5025201248;

import task02.id.ac.its._5025201248.generic.Employee;

/**
 * Class CommissionEmployee represents base salaried commission employee.
 * This class is a distinction of {@link CommissionEmployee}
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    /** Field to contain base salary of the employee in USD */
    private double baseSalary;

    /**
     * Constructor to initialize new commission employee.
     *
     * @param firstName first name of the employee
     * @param lastName last name of the employee
     * @param ssn social security number of the employee
     * @param commissionRate commission rate of the employee
     * @param grossSales gross sales of the employee
     * @param baseSalary base salary of the employee
     * */
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, ssn, commissionRate, grossSales);
        this.setBaseSalary(baseSalary);
    }

    /**
     * This is getter method for field {@link #baseSalary}
     *
     * @return double type data represents base salary of the employee
     * */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * This is setter method for field {@link #baseSalary}.
     * There is additional validation for the only argument,
     * which is the argument must be non negative number (>= 0.0)
     *
     * @param baseSalary gross sales of the employee
     * @throws IllegalArgumentException when base salary is a negative number
     * */
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be non negative number");
        }
        this.baseSalary = baseSalary;
    }

    /**
     * This method returns earnings of the employee with this formula :
     * {@link #baseSalary} + ({@link #commissionRate} * {@link #grossSales})
     *
     * @return earnings of the employee
     * */
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    /**
     * Override toString method from class {@link Employee}
     *
     * @return string with this format :
     * <pre>base salaried commission employee : {@link #firstName} {@link #lastName}
     * <br/>social security number : {@link #ssn}
     * <br/>gross sales : ${@link #grossSales}
     * <br/>commission rate : {@link #commissionRate}
     * <br/>base salary : ${@link #baseSalary}
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "%s%s%s : $%,.2f\n",
                "base salaried ", super.toString(),
                "base salary", baseSalary
        );
    }
}
