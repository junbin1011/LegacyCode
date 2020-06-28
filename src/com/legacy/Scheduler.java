package com.legacy;

import java.util.List;

public class Scheduler {
    private List<Integer> items;

    public void updateScheduleItem(ShceduleItem item) {
        validate(item);
    }

    private void validate(ShceduleItem item) {
        //make calls to a database
    }

    public int getDeadtime() {
        int result = 0;
        for (int i : items) {
            result += i;
        }
        return result;
    }
}

class ShceduleItem {
}
