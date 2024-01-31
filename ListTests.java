import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void TestFilter() {
        String[] strArr = {"hello", "good morning", "hello", "hey", "howdy", "hello"};
        List<String> strList = Arrays.asList(strArr);
        StringChecker cs = new CompareString("he");
        List<String> expected = Arrays.asList("hello", "hello", "hey", "hello");
        List<String> actual = ListExamples.filter(strList, cs);
        assertEquals(expected, actual);
    }

    @Test
    public void TestMerge() {
        List<String> list1 =  Arrays.asList("arr", "brr", "crr");
        List<String> list2 = Arrays.asList("drr", "err", "frr");
        List<String> expected = Arrays.asList("arr", "brr", "crr",
                                            "drr", "err", "frr");
        List<String> actual = ListExamples.merge(list1, list2);
        assertEquals(expected, actual);
    }
}
