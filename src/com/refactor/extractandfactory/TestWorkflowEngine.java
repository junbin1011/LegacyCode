package com.refactor.extractandfactory;

import javax.swing.text.MaskFormatter;

public class TestWorkflowEngine extends WorkflowEngine {
    @Override
    protected MaskFormatter makeFactory() {
        return new FakeMaskFormatter();
    }
}

class FakeMaskFormatter extends MaskFormatter {


}