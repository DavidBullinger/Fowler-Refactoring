import java.lang.*;

/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */


    public static void main(String args[])
    {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("Shreck", 2);
        Movie m2 = new Movie("Shreck 2", 2);
        Rental r1 = new Rental(m1, 30);
        Rental r2 = new Rental(m2, 60);
        Customer c1 = new Customer("David");
        c1.addRental(r1);
        c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
    }
}


