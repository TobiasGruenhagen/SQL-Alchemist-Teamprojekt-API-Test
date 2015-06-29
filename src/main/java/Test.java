import de.tu_bs.cs.ifis.sqlgame.exception.MySQLAlchemistException;
import de.tu_bs.cs.ifis.sqlgame.sandbox.*;
import java.util.Iterator;

/**
 * Class Test.
 * 
 * Testing and presenting the actual projectstatus.
 * 
 * @author Tobias Grünhagen, Philip Holzhüter, Tobias Runge
 */
public class Test {
    
    /**
     * Constructor Test.
     */
    public Test() {
        //Nothing to do.
    }
    
    /**
     * Method main.
     * 
     * @param args unused 
     */
    public static void main(String[] args) {
        try {
            //First example local
            InputFile testFile = new InputFile("alchemy-task.xml", true);
            for (Task task : testFile.getTasks()) {
                task.startTask("local");
            }
        } catch (MySQLAlchemistException mse) {
            System.out.println(mse.getMyMessage());
        }
    }
}
