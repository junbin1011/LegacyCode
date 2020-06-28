package com.legacy;

import com.sun.net.httpserver.HttpsParameters;

import java.util.ArrayList;
import java.util.List;

public class ARMDispatcher {

    List<String> marketBinding = new ArrayList<>();

    public void populate(HttpsParameters parameters) {
        String[] values = parameters.getCipherSuites();
        if (values != null && values.length > 0) {
            marketBinding.add(values[0]);
        }
    }
}
