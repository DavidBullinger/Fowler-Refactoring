import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest
{
    private Movie movieTest;

    private int pricecode = 2;
    private String movietitle = "Shrek";


    @BeforeEach
    public void setUp() throws Exception
    {
        movieTest = new Movie(movietitle, pricecode);
    }

    @Test
    public void getPriceCodeTest()
    {
        assertEquals(pricecode, movieTest.getPriceCode());
    }

    @Test
    public void setPriceCodeTest()
    {
        int pricecodeNew = 1;
        movieTest.setPriceCode(pricecodeNew);
        assertEquals(pricecodeNew, movieTest.getPriceCode());
    }

    @Test
    public void getTitleTest()
    {
        assertEquals(movietitle, movieTest.getTitle());
    }
}
