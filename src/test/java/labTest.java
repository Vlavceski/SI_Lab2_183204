import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class labTest {
    private List<Double> createlist(Integer... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void ESTest{
            RuntimeException ex;
            ex= assert(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(null, 5));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        assertEquals(0,lab.sumOfPricesGreaterThan(createlist(0),0));
        assertEquals(1,lab.sumOfPricesGreaterThan(createlist(0),1));
        assertEquals(2,lab.sumOfPricesGreaterThan(createlist(0),2));
    }
@Test
    void EPTest{
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(null,5));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex=assertThrows(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(-2,5)2);
        assertEquals(0,lab.sumOfPricesGreaterThan(createlist(0),0));
        assertEquals(1,lab.sumOfPricesGreaterThan(createlist(0),1));
        assertEquals(2,lab.sumOfPricesGreaterThan(createlist(0),2));

    }
    @Test
    void MCTest{
        RuntimeException ex;
        // Null i sto bilo
        ex=assertThrows(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(null,5));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        ex=assertThrows(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(Collection.emptyLsit(),5));
        assertEquals(1,lab.sumOfPricesGreaterThan(createlist(0),1));
    }
}