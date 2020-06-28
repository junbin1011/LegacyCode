package com.refactor.pullupfeature;

import java.util.ArrayList;
import java.util.List;

public abstract class SchedulerServices {
    protected List<Integer> items=new ArrayList<>();

    public int getDeadtime() {
        int result = 0;
        for (int i : items) {
            result += i;
        }
        return result;
    }
}
