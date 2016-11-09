package com.javlopez.thecore;

import java.io.IOException;

/**
 * Created by jlopez on 11/9/16.
 */
public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException {
        System.out.println("Something");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}
