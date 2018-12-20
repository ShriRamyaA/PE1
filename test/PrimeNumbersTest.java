import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void findPrimeNumber() {
        PrimeNumbers primeObj=new PrimeNumbers();
        assertEquals("23 is a prime number",primeObj.findPrimeNumber(23));
    }
}