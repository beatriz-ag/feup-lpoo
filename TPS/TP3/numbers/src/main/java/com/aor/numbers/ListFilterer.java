package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

interface GenericListFilter{
    public boolean accept(Integer number);
}

public class ListFilterer {
    GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) { this.filter= filter; }
    public List<Integer> filter(List<Integer> list){
        List<Integer> newList = new ArrayList<Integer>();

        for(Integer ele: list){
            if (filter.accept(ele)) newList.add(ele);
        }

        return newList;
    }
}
