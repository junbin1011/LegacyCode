package com.refactor.parameterconstructor;

import java.sql.SQLPermission;

public class MailChecker {
    int checkPeriodSeconds;
    SQLPermission sqlPermission;

    public MailChecker(int checkPeriodSeconds, SQLPermission sqlPermission) {
        this.sqlPermission = sqlPermission;
        this.checkPeriodSeconds = checkPeriodSeconds;
    }

    public MailChecker(int checkPeriodSeconds) {
        this(checkPeriodSeconds, new SQLPermission(""));
    }
}
