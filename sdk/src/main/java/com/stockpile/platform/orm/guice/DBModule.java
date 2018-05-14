package com.stockpile.platform.orm.guice;

import com.google.code.guice.repository.configuration.*;
import com.google.inject.AbstractModule;
import com.sp.quantum.core.QuantumRuntime;
import com.stockpile.platform.orm.repository.ICountryRepository;

import java.util.Properties;

/**
 * Guice module which loads Jpa Respository modules for Stockpile DB data base.
 * This implementation is intentionally left hard wired to stockpile DB and not meant to be extended.
 * Idea here is to have one place for ORM for legacy stockpile DB.
 */
public class DBModule extends AbstractModule{

    @Override
    protected void configure() {

        install(new JpaRepositoryModule("stockpileDB") { @Override protected void bindRepositories(RepositoryBinder binder) { binder.bind(ICountryRepository.class).to("stockpileDB"); } });
    }

}
