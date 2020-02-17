import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Stephen", "NI45678", 50000, 10000000);
    }
    @Test
    public void canGetName(){
        assertEquals("Stephen", director.getName());
    }
    @Test
    public void canGetNINumber(){
        assertEquals("NI45678", director.getnINumber());
    }
    @Test
    public void canGetSalary(){
        assertEquals(50000, director.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(55000, director.raiseSalary(5000));
    }
    @Test
    public void canGetBonus(){
        assertEquals(500, director.payBonus());
    }
    @Test
    public void canGetBudget(){
        assertEquals(10000000, director.getBudget(),0.01);
    }

}
