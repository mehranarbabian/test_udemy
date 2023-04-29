package parameter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest {
    @ParameterizedTest(name  ="{index}")
    void myTest(String input) {
        System.out.println(input);
    }


    @ParameterizedTest(name = "{arguments}")
    @EnumSource(OwnerType.class)
    void myTest2(OwnerType ownerType) {
        System.out.println(ownerType);
    }
}
