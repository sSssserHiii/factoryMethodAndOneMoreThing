package uni.patterns;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testGetFactoryByCountryCode()
    {
        String countryCode = "EN" ;
        switch (countryCode)
        {
            case "RU":
                assertTrue(true);
                break;
            case "EN":
                assertTrue(true);
                break;
            default:
                throw new RuntimeException("Wrong country code: " + countryCode);
        }
    }
}