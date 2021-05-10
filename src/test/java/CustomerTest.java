import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest
{
    private Customer customerTest;
    private Rental rentalTest1;
    private Rental rentalTest2;
    private Movie movieTest1;
    private Movie movieTest2;

    private String customerName = "David";
    private int daysRented1 = 30;
    private int daysRented2 = 60;
    private int pricecode1 = 2;
    private int pricecode2 = 2;
    private String movietitle1 = "Shreck";
    private String movietitle2 = "Shreck 2";

    private String statementText = "Rental Record for David\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "\tShreck\t\t30\t42.0\n" +
            "\tShreck 2\t\t60\t87.0\n" +
            "Amount owed is 129.0\n" +
            "You earned 2 frequent renter points";


    @BeforeEach
    public void setUp() throws Exception
    {
        movieTest1 = new Movie(movietitle1, pricecode1);
        movieTest2 = new Movie(movietitle2, pricecode2);
        rentalTest1 = new Rental(movieTest1, daysRented1);
        rentalTest2 = new Rental(movieTest2, daysRented2);
        customerTest = new Customer(customerName);
    }

    @Test
    public void addRental()
    {
        customerTest.addRental(rentalTest1);
        customerTest.addRental(rentalTest2);
    }

    @Test
    public void getName()
    {
        assertEquals(customerName, customerTest.getName());
    }

    @Test
    public void statement()
    {
        customerTest.addRental(rentalTest1);
        customerTest.addRental(rentalTest2);
        assertEquals(statementText, customerTest.statement());
    }
}
