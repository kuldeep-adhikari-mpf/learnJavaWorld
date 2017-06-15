package learnJava;

/**
 * Created by kuldeep.adhikari on 6/14/2017.
 */
import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

        String id = UUID.randomUUID().toString();
        return id;

    }
}
