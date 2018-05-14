package com.stockpile.platform.orm.tests;

import com.sp.quantum.tests.fwk.MockContainer;
import org.testng.annotations.BeforeSuite;


/**
 * TestSuite entry class.
 * Use this to i) Start/stop quantum managed services or mock container ii) Bootstrap any common data in DB, since this is for ORM layer.
 * Keep this class as simple and clean as possible, without any actual test logic
 */
public class TestSuite {


    /**
     * Use this to Bootstrap the Quantum Mock container in embedded mode
     * Also start any system services like cache etc here
     */
    @BeforeSuite
    public void start() throws Exception{
        //Setting this from code, so that it can run from IDE
        System.setProperty("EMBEDDED_MODE","true");
        MockContainer.start();
    }


    /**
     * Just stop the mock container
     * @throws Exception
     */
    @BeforeSuite
    public void stop() throws Exception{
        MockContainer.stop();
    }

}
