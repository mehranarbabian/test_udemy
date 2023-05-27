package parameter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest {
    @ParameterizedTest(name  ="{index} : a={0}")
    @CsvSource({"2, 4, 6", "-1, 3, 2", "10, 5, 15"})
    void myTest(String a) {
        System.out.println(a);
    }

    @ParameterizedTest(name = "Test Case {index}: a={0}, b={1}, expectedSum={2}")
    @CsvSource({"2, 4, 6", "-1, 3, 2", "10, 5, 15"})
    public void testAddition(int a, int b, int expectedSum) {
        int sum = a + b;
        Assertions.assertEquals(expectedSum, sum);
    }
    @ParameterizedTest(name = "{arguments}")
    @EnumSource(OwnerType.class)
    void myTest2(OwnerType ownerType) {
        System.out.println(ownerType);
    }

    @ParameterizedTest(name = "{displayName}: value={0}")
    @ValueSource(strings = {"mehran","mahoor","test"})
    void myTest3(String value) {
        System.out.println(value);

    }

    @ParameterizedTest(name = "Test Case {index}: value={0}")
    @CsvSource({"2, -1, 10", "3, 4, 5"})
    public void testPositiveNumbers(int value) {
        System.out.println(value);
    }

    @ParameterizedTest(name = "s={0} a={1} ")
    @CsvFileSource(resources ="/input.csv" ,numLinesToSkip =1)
    public void testCsv(String s,String a)
    {
        System.out.printf(s+a);
    }
}
