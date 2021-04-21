package com.aor.numbers;

import com.aor.numbers.DivisibleByFilter;
import com.aor.numbers.ListFilterer;
import com.aor.numbers.PositiveFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void TestPositivePos(){
        PositiveFilter pos = new PositiveFilter();
        ListFilterer Listf = new ListFilterer(pos);
        List<Integer> toTest = Arrays.asList(1,2,3,4);

        Assertions.assertEquals(Listf.filter(toTest),toTest);
    }
    @Test
    public void TestPositiveFalse(){
        PositiveFilter pos = new PositiveFilter();
        ListFilterer Listf = new ListFilterer(pos);
        List<Integer> toTest = Arrays.asList(-1,2,3,4);

        Assertions.assertEquals(Listf.filter(toTest),Arrays.asList(2,3,4));
    }
    @Test
    public void TestDivisiblePos(){
        DivisibleByFilter div = new DivisibleByFilter(3);
        ListFilterer Listf = new ListFilterer(div);
        List<Integer> toTest = Arrays.asList(3,9,18);

        Assertions.assertEquals(Listf.filter(toTest),Arrays.asList(3,9,18));
    }
    @Test
    public void TestDivisibleFalse(){
        DivisibleByFilter div = new DivisibleByFilter(2);
        ListFilterer Listf = new ListFilterer(div);
        List<Integer> toTest = Arrays.asList(2,4,8,3);

        Assertions.assertEquals(Listf.filter(toTest),Arrays.asList(2,4,8));
    }
}


