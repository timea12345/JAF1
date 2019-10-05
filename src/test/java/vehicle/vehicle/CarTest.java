package vehicle.vehicle;

import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarTest.class);
    private Vehicle testVehicle;

    @BeforeClass
    public static void carTestSetup() {
        LOGGER.info("before all tests");
    }

    @Before
    public void testSetup() {
        LOGGER.info("Before each test.");
        testVehicle = new Car(30);
    }

    @Test
    public void testMaxSpeedIsReachable() {
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for (int i = startSpeed; i < maxSpeed; i++) {
            testVehicle.increaseSpeed();
        }
        assertEquals(maxSpeed, testVehicle.getCurrentSpeed());
    }

    @Test(expected = Vehicle.VehicleCrashedException.class)
    public void testMaxSpeedCannotBeExceeded() {
        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();
        for (int i = startSpeed; i <= maxSpeed; i++) {
            testVehicle.increaseSpeed();
        }
        assertEquals(maxSpeed, testVehicle.getCurrentSpeed());
    }

    @After
    public void testCleanUp() {
        LOGGER.info("After each test.");
    }

    @AfterClass
    public static void finalizeTestingProgram() {
        LOGGER.info("finalizing testing program");
    }
}
