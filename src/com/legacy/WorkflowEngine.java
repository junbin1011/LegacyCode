package com.legacy;

import javax.swing.text.StyleContext;
import java.lang.management.ManagementPermission;

public class WorkflowEngine {
    ManagementPermission managementPermission;

    public WorkflowEngine() {
        String name = StyleContext.NamedStyle.NameAttribute.toString();
        this.managementPermission = new ManagementPermission(name);
    }
}
