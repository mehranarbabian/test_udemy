package repetition;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RepetitionTest {

/*    @RepeatedTest(value = 10, name = "{currentRepetition} - {totalRepetitions}")
    @DisplayName("mehran test")
    void testRepetition() {
        System.out.println("hello");
    } */

    @RepeatedTest(value = 10 ,name ="maamad")
    @DisplayName("mehran test")
    void testRepetition2(TestInfo testInfo,RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " ------------ " + repetitionInfo.getCurrentRepetition());
        System.out.println("hello");
    }


}
