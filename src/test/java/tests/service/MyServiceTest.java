package tests.service;

import org.junit.Before;
import org.junit.Test;
import tests.exception.MyServiceException;
import tests.model.Data;

import static org.junit.Assert.*;

public class MyServiceTest {

    private MyService myService;

    @Before
    public void setUp() {
        myService = new MyService();
    }

    @Test
    public void testGetDataWhenPositiveIdPassedTHenExpectNotNullData() {
        long id = 10;

        Data result = myService.getData(id);

        assertNotNull(result);
    }

    @Test
    public void testGetDataWhenNullIdPassedTHenExpectNotNullData(){
        long id = 0;

        Data result = myService.getData(id);

        assertNotNull(result);
    }

    @Test(expected = MyServiceException.class)
    public void testGetDataWhenNegativeIdPassedTHenExpectNotNullData(){
        long id = -10;

        Data result = myService.getData(id);

//        assertNotNull(result);
    }
}