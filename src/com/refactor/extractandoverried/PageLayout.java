package com.refactor.extractandoverried;

import javax.swing.text.html.StyleSheet;
import java.util.List;

public class PageLayout {
    private int id = 0;
    private List styles;

    protected void rebindStyles() {
        styles = formStyles();
    }

    protected List formStyles() {
        return (List) StyleSheet.getStaticAttributeKey(id);
    }
}
