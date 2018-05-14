package com.stockpile.platform.orm.tests;

import com.sp.quantum.core.QuantumRuntime;

import com.stockpile.platform.orm.guice.DBModule;
import com.stockpile.platform.orm.repository.ICountryRepository;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

@Guice(modules = DBModule.class)
public class TestORM {


    @Inject
    ICountryRepository countryRepository;


    @Test
    public void testConfig() {
        Assert.assertEquals(QuantumRuntime.get("test", "dev"), "foo");
        countryRepository.findByCode("US");
    }
}
