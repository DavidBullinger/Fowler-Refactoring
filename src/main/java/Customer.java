import java.lang.*;
import java.util.*;

class Customer
{
    private String name;
    private Vector rentals = new Vector();

    public Customer(String newname)
    {
        name = newname;
    }

    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    }

    public String getName()
    {
        return name;
    }

    public String statement()
    {
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements())
        {
            Rental currentRental = (Rental) enum_rentals.nextElement();
            // add frequent renter points

            //show figures for this rental
            result += "\t" + currentRental.getMovie().getTitle() + "\t" + "\t" + currentRental.getDaysRented() + "\t" + String.valueOf(currentRental.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge()
    {
        double result = 0;
        Enumeration rentalsE = rentals.elements();
        while (rentalsE.hasMoreElements()) {
            Rental each = (Rental) rentalsE.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints()
    {
        int result = 0;
        Enumeration rentalsE = rentals.elements();
        while (rentalsE.hasMoreElements()) {
            Rental each = (Rental) rentalsE.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
    