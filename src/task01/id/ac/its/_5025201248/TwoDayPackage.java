package task01.id.ac.its._5025201248;

/**
 * class Person represents package with two days shipping method
 * that will be deliver to recipient in this Package Application.
 * This class inherit class {@link Package} and all of its props.
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 20th 2021
 * */
public class TwoDayPackage extends Package {

    /** Field to contain additional flat fee for the package with two days shipping */
    private double flatFee;

    /**
     * Constructor to initialize new package with two days shipping method
     *
     * @param sender {@link Person} type object indicates sender of the new package
     * @param recipient {@link Person} type object indicates recipient of the new package
     * @param weight double type data indicates weight of the new package in ounce(s)
     * @param costPerOunce double type data indicates shipping cost of the new package per ounce in USD
     * @param flatFee double type data indicates additional flat fee for the package with two days shipping
     * */
    public TwoDayPackage(Person sender, Person recipient, double weight, double costPerOunce, double flatFee) {
        /* call super constructor */
        super(sender, recipient, weight, costPerOunce);

        /*
         * Using setter to set the flat fee
         * in order to pass some validation
         * */
        setFlatFee(flatFee);
    }

    /**
     * This is getter method for field {@link #flatFee}
     *
     * @return field {@link #flatFee}
     * */
    public double getFlatFee() {
        return flatFee;
    }

    /**
     * This is setter method for field {@link #flatFee}.
     * There is additional validation for the only argument,
     * which is the argument must be greater or equal to 0
     *
     * @param flatFee additional shipping cost of the package in USD
     * @throws IllegalArgumentException when additional shipping cost is negative number
     * */
    public void setFlatFee(double flatFee) {
        if (flatFee < 0) {
            throw new IllegalArgumentException("Flat fee cannot be negative number");
        }
        this.flatFee = flatFee;
    }

    /**
     * This method is used to calculate and return the total
     * shipping cost of this package, which is calculated by adding
     * the original cost with {@link #flatFee}
     *
     * @return double data indicates total shipping cost of this package with two days shipping method
     * */
    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    /**
     * Override method from class {@link Object}
     *
     * @return string with this format
     * <pre>Package information
     * <br/>shipping method : unknown
     * <br/>sender          : {@link #sender}
     * <br/>recipient       : {@link #recipient}
     * <br/>weight          : {@link #weight} ounce(s)
     * <br/>cost            : {@link #costPerOunce} USD per ounce
     * <br/>additional fee  : {@link #flatFee} USD
     * <br/>total cost      : {@link #calculateCost()} USD
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "Package information\n" +
                "Sender\t\t\t: %s\n" +
                "recipient\t\t: %s\n" +
                "shipping method\t: Two days shipping\n" +
                "weight\t\t\t: %,.2f ounce(s)\n" +
                "cost\t\t\t: %,.2f USD per ounce\n" +
                "additional fee\t: %,.2f USD\n" +
                "total cost\t\t: %,.2f USD\n",
                sender.getName(), recipient.getName(), weight, costPerOunce, flatFee, calculateCost());
    }
}
