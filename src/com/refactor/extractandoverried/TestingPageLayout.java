package com.refactor.extractandoverried;

import java.util.ArrayList;
import java.util.List;

public class TestingPageLayout extends PageLayout {
    @Override
    protected List formStyles() {
        return new ArrayList();
    }
}
