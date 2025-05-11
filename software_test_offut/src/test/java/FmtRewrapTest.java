import br.software_test_offut.app.FmtRewrap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FmtRewrapTest {

    //#region Node coverage
    
    
    // [1,2,3,5,7,8,10,17,18,2,19]
    // [1,2,3,5,7,9,10,17,18,2,19]
    
    //[1,2,3,4,10,11,18,2,19]
    @Test
    public void firstNodeCoverage() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FmtRewrap.fmtRewrap("  ", 2));
    }

    //[1,2,3,4,10,12,18,2,19]
    @Test
    public void secondNodeCoverage() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FmtRewrap.fmtRewrap("  ", 1));
    }

    // [1,2,3,4,10,13,14,18,2,19]
    @Test
    public void thirdNodeCoverage() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FmtRewrap.fmtRewrap(" \n", 1));
    }

    // [1,2,3,4,10,13,15,18,2,19]
    @Test
    public void fourthNodeCoverage() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FmtRewrap.fmtRewrap("A", 1));
    }

    // [1,2,3,4,10,16,17,18,2,19]
    @Test
    public void fifthNodeCoverage() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FmtRewrap.fmtRewrap("AA", 1));
    }

    // [1,2,3,5,6,10,17,18,2,19]
    @Test
    public void sixNodeCoverage() {
        assertEquals(" \n", FmtRewrap.fmtRewrap("\n", 4));
    }

    
    //#endregion
}
