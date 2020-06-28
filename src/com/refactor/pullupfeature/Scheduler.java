package com.refactor.pullupfeature;

public class Scheduler extends SchedulerServices {

    public void updateScheduleItem(ShceduleItem item) {
        validate(item);
    }

    private void validate(ShceduleItem item) {
        //make calls to a database
    }

}

class ShceduleItem {
}
