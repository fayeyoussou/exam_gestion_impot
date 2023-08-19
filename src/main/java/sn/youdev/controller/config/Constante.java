package sn.youdev.controller.config;

import org.springframework.beans.factory.annotation.Value;

public final class Constante {
    private Constante(){
        throw new RuntimeException();
    }
    public static final String LAYOUT = "layout";
    public static final String CREATE = "create";

}
