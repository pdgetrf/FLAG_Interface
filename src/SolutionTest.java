import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testUniquePaths() {

        List<TestCase> testCases = getTestCases();

        for (int i = 0; i < testCases.size(); i++) {
            System.out.printf("case %d\n", i);
            TestCase testCase = testCases.get(i);
            assertEquals(testCase.expect, Solution.uniquePaths(testCase.m, testCase.n));
        }
    }

    private List<TestCase> getTestCases() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(0, 0, 0));
        testCases.add(new TestCase(1, 1, 1));
        testCases.add(new TestCase(1, 2, 1));
        testCases.add(new TestCase(2, 1, 1));
        testCases.add(new TestCase(2, 2, 2));
        testCases.add(new TestCase(2, 3, 3));
        testCases.add(new TestCase(3, 2, 3));
        testCases.add(new TestCase(5, 3, 15));
        testCases.add(new TestCase(5, 3, 15));
        testCases.add(new TestCase(7, 3, 28));
        return testCases;
    }
}
