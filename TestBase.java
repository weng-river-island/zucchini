/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merchantwarehouse.qa.cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 *
 * @author dominicl
 */
public class TestBase {

    private int a;
    private int b;
    private int total;

    @Given("^two integers (\\d+) and (\\d+)$")
    public final void given_two_integers(final Integer a, final Integer b) {
        this.a = a;
        this.b = b;
    }

    @When("^you add them together$")
    public final void when_you_add_them_together() {
        total = a + b;
    }

    public final Integer getTotal() {
        return total;
    }
}
