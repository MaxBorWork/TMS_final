package tests.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongTimeRunningServiceTest {

    @Test(timeout = 2_000)
    public void testExecuteTask() {
        LongTimeRunningService service = new LongTimeRunningService();

        boolean result = service.executeTask();

        assertTrue(result);
    }

}