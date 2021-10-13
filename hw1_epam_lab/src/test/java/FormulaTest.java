import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulaTest {

    @Test
    public void getResultG_ShouldReturnRightResult_WhenDataValid() {
        double result = Formula.getResultG(1, 1, 1, 1);
        assertEquals(result, 19.74, 2);
    }
}