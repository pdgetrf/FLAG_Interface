import java.util.List;

public class TestCase {
    List<List<Integer>> lists;
    int[] expect;

    public TestCase(List<List<Integer>> lists, int[] expect) {
        this.lists = lists;
        this.expect = expect;
    }
}