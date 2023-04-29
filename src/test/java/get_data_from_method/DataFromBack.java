package get_data_from_method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DataFromBack {
    @DisplayName("name")
    @ParameterizedTest
    @MethodSource("getArgs")
    void name(String first,int second,int third) {
        System.out.println(first+second+third);
    }
    static Stream<Arguments> getArgs()
    {
        return Stream.of(Arguments.of("TH",2,3),
                Arguments.of("Ch",2,3)



        );
    }
}
