package com.refactor.extractandfactory;

import javax.swing.text.MaskFormatter;
import javax.swing.text.StyleContext;
import java.lang.management.ManagementPermission;
import java.text.ParseException;

public class WorkflowEngine {
    MaskFormatter maskFormatter;

    public WorkflowEngine() {
        try {
            this.maskFormatter = makeFactory();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    protected MaskFormatter makeFactory() throws ParseException {
        String name = StyleContext.NamedStyle.NameAttribute.toString();
        return new MaskFormatter(name);
    }
}
