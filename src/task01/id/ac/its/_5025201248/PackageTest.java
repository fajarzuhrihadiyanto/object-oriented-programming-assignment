package task01.id.ac.its._5025201248;

/**
 * This class represents console application for testing purposes
 * */
public class PackageTest {

    public static void main(String[] args) {

        // Create new sender instance from class Person
        Person sender = new Person("Edward Bradley", "3930 Woodridge Lane", "Memphis", "Tennessee", "38116");
        System.out.println("Sender Information");
        System.out.println(sender);

        // Create new recipient instance from class Person
        Person recipient = new Person("Spencer Morton", "216 Maryland Avenue", "Sorrento", "Louisiana", "70778");
        System.out.println("Recipient Information");
        System.out.println(recipient);

        // Create new package instance from class Package
        Package package1 = new Package(sender, recipient, 36.2, 1.1);
        System.out.println(package1);

        // Create new package instance from class TwoDayPackage
        TwoDayPackage package2 = new TwoDayPackage(sender, recipient, 21.7, 0.8, 5.0);
        System.out.println(package2);

        // Create new package instance from class OvernightPackage
        OvernightPackage package3 = new OvernightPackage(sender, recipient, 27.0, 0.65, 0.35);
        System.out.println(package3);
    }

}
