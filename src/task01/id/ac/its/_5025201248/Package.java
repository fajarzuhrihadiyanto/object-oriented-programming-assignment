package task01.id.ac.its._5025201248;

/**
 * class Person represents general package that will be deliver
 * to recipient in this Package Application
 *
 * @author Fajar Zuhri Hadiyanto
 * @version 1.0
 * @since October 20th 2021
 * */
public class Package {

    /** Field to contain sender of the package */
    protected Person sender;

    /** Field to contain recipient of the package */
    protected Person recipient;

    /** Field to contain weight of the package in ounce(s) */
    protected double weight;

    /** Field to contain shipping cost of the package per ounce in USD */
    protected double costPerOunce;

    /**
     * Constructor to initialize new package
     *
     * @param sender {@link Person} type object indicates sender of the new package
     * @param recipient {@link Person} type object indicates recipient of the new package
     * @param weight double type data indicates weight of the new package in ounce(s)
     * @param costPerOunce double type data indicates shipping cost of the new package per ounce in USD
     * */
    public Package(Person sender, Person recipient, double weight, double costPerOunce) {
        this.sender = sender;
        this.recipient = recipient;

        /*
        * Using setter to set weight and cost per ounce
        * in order to pass some validation
        * */
        setWeight(weight);
        setCostPerOunce(costPerOunce);
    }

    /**
     * This is getter method for field {@link #sender}
     *
     * @return field {@link #sender}
     * */
    public Person getSender() {
        return sender;
    }

    /**
     * This is setter method for field {@link #sender}
     *
     * @param sender {@link Person} type object indicates the sender
     * */
    public void setSender(Person sender) {
        this.sender = sender;
    }

    /**
     * This is getter method for field {@link #recipient}
     *
     * @return field {@link #recipient}
     * */
    public Person getRecipient() {
        return recipient;
    }

    /**
     * This is setter method for field {@link #recipient}
     *
     * @param recipient {@link Person} type object indicates the recipient
     * */
    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    /**
     * This is getter method for field {@link #weight}
     *
     * @return field {@link #weight}
     * */
    public double getWeight() {
        return weight;
    }

    /**
     * This is setter method for field {@link #weight}.
     * There is additional validation for the only argument,
     * which is the argument must be greater than 0
     *
     * @param weight weight of the package in ounce(s)
     * @throws IllegalArgumentException when weight is zero or negative number
     * */
    public void setWeight(double weight) {
        if (weight <= 0.0) {
            throw new IllegalArgumentException("Weight must be non zero positive number");
        }
        this.weight = weight;
    }

    /**
     * This is getter method for field {@link #costPerOunce}
     *
     * @return field {@link #costPerOunce}
     * */
    public double getCostPerOunce() {
        return costPerOunce;
    }

    /**
     * This is setter method for field {@link #costPerOunce}.
     * There is additional validation for the only argument,
     * which is the argument must be greater than 0
     *
     * @param costPerOunce shipping cost per ounce of the package in USD
     * @throws IllegalArgumentException when weight is zero or negative number
     * */
    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce <= 0.0) {
            throw new IllegalArgumentException("Cost per ounce must be non zero positive number");
        }
        this.costPerOunce = costPerOunce;
    }

    /**
     * This method is used to calculate and return
     * the total shipping cost of this package, which is calculated by multiply
     * {@link #weight} by {@link #costPerOunce}
     *
     * @return double data indicates total shipping cost of this package
     * */
    public double calculateCost() {
        return costPerOunce * weight;
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
     * <br/>total cost      : {@link #calculateCost()} USD
     * </pre>
     * */
    @Override
    public String toString() {
        return String.format(
                "Package information\n" +
                "Sender\t\t\t: %s\n" +
                "recipient\t\t: %s\n" +
                "shipping method\t: unknown\n" +
                "weight\t\t\t: %,.2f ounce(s)\n" +
                "cost\t\t\t: %,.2f USD per ounce\n" +
                "total cost\t\t: %,.2f USD\n",
                sender.getName(), recipient.getName(), weight, costPerOunce, calculateCost());
    }
}
