package parameter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("getName")
     void name(String input) {
        System.out.println(input);
    }

     static Stream<Arguments> getName()
    {
        return Stream.of(Arguments.of("mamad"),Arguments.of("mehran"),Arguments.of("lila"));
    }
}
