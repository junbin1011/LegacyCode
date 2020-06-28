package com.refactor.setstaticmethod;

public class RouterFactoryTest {


    void setUp() {
        RouterFactory.setServer(new RouterServer() {
            @Override
            public Router makeRouter() {
                return new Router();
            }
        });
    }


}