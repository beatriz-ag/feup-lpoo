package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    @Nested
    class AggregatorGemeral {
        List<Integer> agList;
        @Test
        public void sum() {
            ListAggregator aggregator = new ListAggregator(agList);

            int sum = aggregator.sum();

            Assertions.assertEquals(14, sum);
        }

        @Test
        public void max() {
            ListAggregator aggregator = new ListAggregator(agList);

            int max = aggregator.max();

            Assertions.assertEquals(5, max);
        }

        @Test
        public void min() {
            ListAggregator aggregator = new ListAggregator(agList);

            int min = aggregator.min();

            Assertions.assertEquals(1, min);
        }

        @Test
        public void max_bug_7263(){
            List<Integer> test = Arrays.asList(-1,-4,-5);
            ListAggregator agregator = new ListAggregator(test);

            int max = agregator.max();

            Assertions.assertEquals(max,-1);
        }

        @Test
        public void distinct() {
            ListAggregator aggregator = new ListAggregator(agList);

            int distinct = aggregator.distinct(new ListDeduplicator(agList));

            Assertions.assertEquals(4, distinct);
        }

        @BeforeEach
        private void setList(){
            List<Integer> list = Arrays.asList(1,2,4,2,5);
            this.agList = list;
        }

    }

    @Nested
    class DistinctTests{
        List<Integer> distinctList;

        @BeforeEach
        private void setList(){
            this.distinctList = Arrays.asList(1,2,4,2);
        }

        class StubListDeduplicator implements IlistDeduplicator{
            public List<Integer> deduplicate(IListSorter sorter){
                return Arrays.asList(1,2,4);
            }
        }

        @Test
        public void max_bug_8726(){
            ListAggregator agregator = new ListAggregator(distinctList);
            int distinct = agregator.distinct(new StubListDeduplicator());
            Assertions.assertEquals(distinct,3);
        }

        @Test
        public void max_bug_8726Mockito(){
            IListSorter sorterStub = Mockito.mock((IListSorter.class));
            Mockito.when(sorterStub.sort()).thenReturn(Arrays.asList(1,2,4));

            ListDeduplicator deduplicator = new ListDeduplicator(distinctList);
            List<Integer> distinct = deduplicator.deduplicate(sorterStub);

            Assertions.assertEquals(Arrays.asList(1,2,4),distinct);
        }

    }
}
