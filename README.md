Втора лабораториска вежба по Софтверско инженерство
Никола Влавчески, бр. на индекс 183204
Група на код: 5

Control Flow Graph
Фотографија од control flow graph-ot


Тест случаи според критериумот Every statement
@Test

void ESTest{

            RuntimeException ex;
        ex= assert(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(null, 5));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertEquals(0,lab.sumOfPricesGreaterThan(createlist(0),0));
        assertEquals(1,lab.sumOfPricesGreaterThan(createlist(0),1));
        assertEquals(2,lab.sumOfPricesGreaterThan(createlist(0),2));
    }
    
Тест случаи според критериумот Every path
@Test
    void EPTest{
    
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> lab.sumOfPricesGreaterThan(null,5));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertEquals(0,lab.sumOfPricesGreaterThan(createlist(0),0));
        assertEquals(1,lab.sumOfPricesGreaterThan(createlist(0),1));
        assertEquals(2,lab.sumOfPricesGreaterThan(createlist(0),2));

    }
Објаснување на напишаните unit tests
