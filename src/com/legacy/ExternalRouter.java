package com.legacy;

public class ExternalRouter {
    private static ExternalRouter instance;

    private ExternalRouter() {
    }

    public static ExternalRouter getInstance() {
        if (instance == null) {
            instance = new ExternalRouter();
        }
        return instance;
    }
}
