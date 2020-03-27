package com.metaring.framework.ext.vertx;

import java.util.concurrent.Executor;

import io.vertx.core.Vertx;

public class VertxUtilities {

    public static final String CFG_VERTX = "vertx";
    public static final String CFG_INSTANCES = "instances";

    public static final Vertx INSTANCE;
    public static final Executor INSTANCE_AS_EXECUTOR;

    static {
        INSTANCE = Vertx.vertx();
        INSTANCE_AS_EXECUTOR = runnable -> INSTANCE.runOnContext(v -> runnable.run());
    }
}