import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Susan", "NI67890", 23000);
    }

    @Test
    public void canGetName(){
        assertEquals("Susan", developer.getName());
    }
    @Test
    public void canGetNINumber(){
        assertEquals("NI67890", developer.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(23000, developer.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(28000, developer.raiseSalary(5000));
    }
    @Test
    public void canGetBonus(){
        assertEquals(230, developer.payBonus());
    }

}
