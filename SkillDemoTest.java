import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{

    @Test
    public void testAdd(){
        SkillDemo tester = new SkillDemo();
        assertEquals(3,tester.addNum(1,2));
    }
    
}
