package com.javlopez.thecore;

import java.io.IOException;

/**
 * Created by jlopez on 11/9/16.
 */
public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException {
        throw new IOException("Exception from SaySomething()");
        //System.out.println("Something");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception from Close");
        //System.out.println("close");
    }
}
