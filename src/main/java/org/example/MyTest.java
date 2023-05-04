package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.exceptions.MyCustomException;
import org.junit.*;

public class MyTest {
    private static final Logger logger = LogManager.getLogger(MyTest.class);

    @Test
    public void testCustomException() {
        try {
            throw new MyCustomException("Custom exception message");
        } catch (MyCustomException e) {
            Assert.assertEquals("Custom exception message", e.getMessage());
            logger.info("testCustomException succeeded");
            return;
        } catch (Exception e) {
            Assert.fail("Expected MyCustomException was not thrown.");
            logger.error("Expected MyCustomerExceptipn was not thrown.");
        }
        Assert.fail("Expected MyCustomException was not thrown.");
    }
}


