import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RentalTest
{
    private Rental rentalTest;
    private Movie movieTest;

    private int daysRented = 30;
    private int pricecode = 2;
    private String movietitle = "Shreck";


    @BeforeEach
    public void setUp() throws Exception
    {
        movieTest = new Movie(movietitle, pricecode);
        rentalTest = new Rental(movieTest, daysRented);
    }

    @Test
    public void getDaysRentedTest()
    {
        assertEquals(daysRented, rentalTest.getDaysRented());
    }

    @Test
    public void getMovieTest()
    {
        assertEquals(movieTest, rentalTest.getMovie());
    }
}
