package com.refactor.setstaticmethod;

class RouterFactory implements RouterServer {

    @Override
    public Router makeRouter() {
        return server.makeRouter();
    }


    public static void setServer(RouterServer server) {
        RouterFactory.server = server;
    }

    static RouterServer server = new RouterServer() {

        @Override
        public Router makeRouter() {
            return new Router();
        }
    };
}

class Router {
}