import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Susan", "NI67890", 23000);
    }

    @Test
    public void canGetName(){
        assertEquals("Susan", databaseAdmin.getName());
    }
    @Test
    public void canGetNINumber(){
        assertEquals("NI67890", databaseAdmin.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(23000, databaseAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(28000, databaseAdmin.raiseSalary(5000));
    }
    @Test
    public void canGetBonus(){
        assertEquals(230, databaseAdmin.payBonus());
    }


}
