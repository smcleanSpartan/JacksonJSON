package com.spartaglobal.jackson;

import JacksonDeserialisation.RatesDeserialiser;
import JacksonManualParsing.JacksonManualExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JacksonManualExample example = new JacksonManualExample("resources/rates.json");

        RatesDeserialiser rateDes = new RatesDeserialiser("resources/rates.json");

        System.out.println( rateDes.ratesMapped.getRates().get("AED"));
    }
}
