package com.refactor.setstaticmethod;

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

    public static void setInstance(ExternalRouter instance) {
        ExternalRouter.instance = instance;
    }
}
