package beforeAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeTest {
    @BeforeAll
    public  void callMeBefore()
    {
        System.out.println(System.identityHashCode(this));
        System.out.println("hello");
    }

    @Test
    void name() {
        System.out.println("hi");
    }
}
