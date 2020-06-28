package com.legacy;

import java.sql.SQLPermission;

public class MailChecker {
    int checkPeriodSeconds;
    SQLPermission sqlPermission;

    public MailChecker(int checkPeriodSeconds) {
        this.sqlPermission=new SQLPermission("");
        this.checkPeriodSeconds = checkPeriodSeconds;
    }
}
