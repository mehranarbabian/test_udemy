package di;

import org.junit.jupiter.api.*;

@Tag("Repeated")
public class DependencyInjectionTest {

    @BeforeEach
    void name(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(repetitionInfo.getCurrentRepetition());
    }
//it is important to annotate with RepeatedTest
    @RepeatedTest(value = 3)
    void name() {

    }
}
