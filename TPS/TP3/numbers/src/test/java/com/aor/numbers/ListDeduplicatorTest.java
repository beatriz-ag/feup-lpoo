package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    @Test
    public void deduplicate() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(new ListSorter(list));

        Assertions.assertEquals(expected, distinct);
    }


    class StubListSorter implements IListSorter{
        public List<Integer> sort(){
            return Arrays.asList(1,2,2,4);
        }
    }
    @Test
    public void testDeduplicate(){
        List<Integer> test = Arrays.asList(1,2,4,2);

        ListDeduplicator deduplicator = new ListDeduplicator(test);
        test = deduplicator.deduplicate(new ListSorter(test));

        Assertions.assertEquals(test.size(),3);
    }

    @Test
    public void deduplicateMockito(){
        IListSorter sorterStub = Mockito.mock((IListSorter.class));
        Mockito.when(sorterStub.sort()).thenReturn(Arrays.asList(1,2,2,4,5));

        List<Integer> list = Arrays.asList(1,2,4,2,5);
        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(sorterStub);

        Assertions.assertEquals(Arrays.asList(1,2,4,5),distinct);
    }
}
