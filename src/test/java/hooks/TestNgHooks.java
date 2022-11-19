package hooks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNgHooks {
    private Logger LOGGER = LoggerFactory.getLogger(TestNgHooks.class);
    @BeforeClass
    public void before(){
        LOGGER.info("Before TestNG Hook");
    }

    @AfterClass
    public void test(){
        LOGGER.info("After TestNG Hook");
    }
}
