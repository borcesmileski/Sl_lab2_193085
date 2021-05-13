import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void function() {
        //Testing branch 1,2,3,4,5,8
        Time angle = new Time(10, 30, 30);
        List<Time> anglesList = new ArrayList<>();
        anglesList.add(angle);
        try {
            SILab2.function(anglesList);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The minutes of the angle are not valid!");
        }
    }
    @Test
    public void function1() {
        //Testing branch 1,2,3,4,5,8
        Time angle = new Time(10, 30, 30);
        List<Time> anglesList = new ArrayList<>();
        anglesList.add(angle);
        try {
            SILab2.function(anglesList);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The minutes of the angle are not valid!");
        }
    }

}