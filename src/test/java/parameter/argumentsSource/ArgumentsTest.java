package parameter.argumentsSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ArgumentsTest {

    @ParameterizedTest
    @ArgumentsSource(CustomProvider.class)
    void name(String input) {
        System.out.println(input);
    }
}
