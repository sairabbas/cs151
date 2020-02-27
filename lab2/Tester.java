import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;
class Tester
{
    private static Arrays testArrays;
    private int[] a;

    @BeforeAll
    static void setUpBeforeClass() throws Exception
    {
        System.out.println("Running: Set Up Before Class");
        testArrays = new Arrays();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception
    {
        System.out.println("Running: Tear Down After Class");
        testArrays = null;
    }

    @BeforeEach
    void setUp() throws Exception
    {
        System.out.println("Running: Set Up Before Test");
    }

    @AfterEach
    void tearDown() throws Exception
    {
        System.out.println("Running: Tear Down After Test");
    }

    @Test
    void test1() throws Exception
    {
        System.out.println("Running: test1");
        a = new int[]{5, 4, 1, 9, 2, 6};
        testArrays.swapLargestAndSmallest(a);
        assertEquals("[5, 4, 9, 1, 2, 6]", java.util.Arrays.toString(a));
    }

    @Test
    void test2() throws Exception
    {
        System.out.println("Running: test2");
        a = new int[] {1, 4, 1, 9, 2, 6};
        testArrays.swapLargestAndSmallest(a);
        assertEquals("[9, 4, 1, 1, 2, 6]", java.util.Arrays.toString(a));
    }

    @Test
    void test3() throws Exception
    {
        System.out.println("Running: test3");
        a = new int[] {1, 4, 2, 9, 9, 6};
        testArrays.swapLargestAndSmallest(a);
        assertEquals("[9, 4, 2, 1, 9, 6]", java.util.Arrays.toString(a));
    }

    @Test
    void test4() throws Exception
    {
        System.out.println("Running: test4");
        a = new int[] {1};
        testArrays.swapLargestAndSmallest(a);
        assertEquals("[1]", java.util.Arrays.toString(a));
    }
}
