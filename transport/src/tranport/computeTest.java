package tranport;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class computeTest {

    @Parameters({"x","y","z","w"})
    @Test
    public void testComputemoney(int x,int y,int z, int w) {
        System.out.println("x= "+ x);
    }
}