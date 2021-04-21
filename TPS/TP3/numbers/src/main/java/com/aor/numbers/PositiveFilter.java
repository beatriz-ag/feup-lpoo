package com.aor.numbers;

import com.aor.numbers.GenericListFilter;

public class PositiveFilter implements GenericListFilter {
    public PositiveFilter(){}
    public boolean accept(Integer number){
        return number>0;
    }
}
