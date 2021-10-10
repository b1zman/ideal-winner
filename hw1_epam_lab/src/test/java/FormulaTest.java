import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FormulaTest {

    @Test
   public void getResultG() {
        Formula formula = new Formula(1,1,1,1);
        double result = formula.getResultG();
        assertEquals(formula.getResultG(),19.74,2);
        }
    }
