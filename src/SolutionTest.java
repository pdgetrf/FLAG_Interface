import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void testSumLists() {

        List<TestCase> testCases = getTestCases();

        for (int i = 0; i < testCases.size(); i++) {
            System.out.printf("case %d\n", i);
            TestCase testCase = testCases.get(i);
            assertTrue(Arrays.equals(testCase.expect, Solution.sumLists(testCase.lists)));
        }
    }

    private List<TestCase> getTestCases() {
        int[][] values = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
        };

        List<List<Integer>> lists = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int val : values[0]) {
            linkedList.add(val);
        }
        lists.add(linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int val : values[1]) {
            arrayList.add(val);
        }
        lists.add(arrayList);

        int[] expects = new int[]{10, 35};

        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(lists, expects));

        return testCases;
    }
}
