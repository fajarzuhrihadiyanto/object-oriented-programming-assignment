package task02.id.ac.its._5025201248;

import task02.id.ac.its._5025201248.generic.Employee;

/**
 * This class represents console application for testing purposes
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 28th 2021
 * */
public class PayrollSystemTest {

    public static void main(String[] args) {
        /* Create new employees of all types */
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joseph", "Hagy", "462-48-2651", 1200);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("James", "Bosse", "009-20-1735", 18.00, 40.00);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Heather", "Baum", "146-16-6134", 0.08, 9800);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Shari", "Fernandes", "213-02-5136", 0.05,7500, 250);

        /* Display the data of each employee, including their earnings */
        System.out.printf(
                "%s%s: $%,.2f\n\n",
                salariedEmployee,
                "earned", salariedEmployee.earnings());
        System.out.printf(
                "%s%s: $%,.2f\n\n",
                hourlyEmployee,
                "earned", hourlyEmployee.earnings());
        System.out.printf(
                "%s%s: $%,.2f\n\n",
                commissionEmployee,
                "earned", commissionEmployee.earnings());
        System.out.printf(
                "%s%s: $%,.2f\n\n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());

        /* Polymorphic phase for all types of employee */
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        /* Loop for all employees in the array */
        for (Employee employee: employees) {

            /* Display the data (again) */
            System.out.print(employee);

            /* Check if the employee is base salaried commission type employee */
            if (employee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee newEmployee = (BasePlusCommissionEmployee) employee;

                /* Increase the base salary by 10% */
                newEmployee.setBaseSalary(1.1 * newEmployee.getBaseSalary());

                /* Display new base salary */
                System.out.printf("new base salary with 10%% increase is : $%,.2f\n", newEmployee.getBaseSalary());
            }

            /* Display earnings of the employee */
            System.out.printf("earned $%,.2f\n\n", employee.earnings());
        }

        /* Display the class of each employee */
        for (int i = 0; i < employees.length; i++) {
            System.out.printf(
                    "employee %d is a %s\n", i, employees[i].getClass().getSimpleName());
        }
    }
}
