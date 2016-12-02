/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.ea;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nadine
 */
public class ZahlenkonverterTest {
    
    public ZahlenkonverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 @Test
    public void shouldReturnCharAsNum() {
        assertThat(Zahlenkonverter.getDezimalZahl("F"), is(0));
        assertThat(Zahlenkonverter.getDezimalZahl("MCCXXXIV"), is(1234));
        assertThat(Zahlenkonverter.getDezimalZahl("I"), is(1));
        assertThat(Zahlenkonverter.getDezimalZahl("IV"), is(4));
        assertThat(Zahlenkonverter.getDezimalZahl("V"), is(5));
        assertThat(Zahlenkonverter.getDezimalZahl("VI"), is(6));
        assertThat(Zahlenkonverter.getDezimalZahl("VII"), is(7));
        assertThat(Zahlenkonverter.getDezimalZahl("XI"), is(11));
        assertThat(Zahlenkonverter.getDezimalZahl("XXV"), is(25));
    }

    @Test
    public void shouldReturnNumAsChar() {
        assertThat(Zahlenkonverter.getRoemischeZahl(1000), is("M"));
        assertThat(Zahlenkonverter.getRoemischeZahl(1), is("I"));
        assertThat(Zahlenkonverter.getRoemischeZahl(1234), is("MCCXXXIV"));
        assertThat(Zahlenkonverter.getRoemischeZahl(6489), is("MMMMMMCDLXXXIX"));
    }

}
