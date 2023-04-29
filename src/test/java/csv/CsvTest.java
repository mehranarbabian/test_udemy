package csv;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvTest {
    @DisplayName("csv")
    @ParameterizedTest
    @CsvFileSource(resources = "/input.csv",numLinesToSkip = 1)
    void csv(String name,String family) {
        System.out.println(name+family);
    }
}
