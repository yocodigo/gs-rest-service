import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class GreetingTest {
    @Test
    public void test() {
        Greeting greeting = new Greeting();
        assertThat(greeting.getContent(), is("Hello world!"));
    }
}