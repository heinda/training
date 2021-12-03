package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.fail;

public class myIntegrationTestIT {

    @Test
    public void name() {
        System.out.printf("Integration test");
        fail("You shall not pass!");
    }
}
