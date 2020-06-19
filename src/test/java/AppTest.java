import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;

import test.TestClass;


public class AppTest {

    @Mock
    private TestClass testClass;

    @Captor
    private ArgumentCaptor<Integer> arg;

    @Before
    public void setUp() {
        initMocks(this);
        testClass = new TestClass();
    }

    @Test
    public void test() {
        System.out.println("pengli");
    }

}
