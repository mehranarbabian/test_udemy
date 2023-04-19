package parameter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest {
    @ParameterizedTest(name  ="{index}")
    @ValueSource(strings = {"mehran","mamad","ali"})
    void myTest(String input) {
        System.out.println(input);
    }
}
