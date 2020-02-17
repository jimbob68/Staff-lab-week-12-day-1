import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Finance");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }
    @Test
    public void canGetNINumber(){
        assertEquals("NI12345", manager.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(20000, manager.getSalary());
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(25000, manager.raiseSalary(5000));
    }
    @Test
    public void canGetBonus(){
        assertEquals(200, manager.payBonus());
    }

}
