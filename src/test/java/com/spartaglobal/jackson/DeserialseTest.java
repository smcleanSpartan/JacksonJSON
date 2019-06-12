package com.spartaglobal.jackson;

import JacksonDeserialisation.RatesDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DeserialseTest {

    private static RatesDeserialiser rates;

    @BeforeClass
    public static void setup(){
        rates = new RatesDeserialiser("resources/rates.json");
    }

    @Test
    public void testSuccessIsTrue(){
        Assert.assertTrue(rates.ratesMapped.isSuccess());
    }

    @Test
    public void testTimeStamp(){

    }

    @Test
    public void testBaseIsEUR(){
        Assert.assertEquals("EUR", rates.ratesMapped.getBase());
    }

    @Test
    public void testStubDate(){
        Assert.assertEquals("2018-10-10", rates.ratesMapped.getDate());
    }

    /*@Test
    public void testRate(){
        Assert.assertEquals("2018-10-10", rates.ratesMapped.getDate());
    }*/

}
