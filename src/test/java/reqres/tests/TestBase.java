package reqres.tests;

import org.aeonbits.owner.ConfigFactory;
import reqres.config.ApiConfig;

public class TestBase {
    protected static final ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

}
