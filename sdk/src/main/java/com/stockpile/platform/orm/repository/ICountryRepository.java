package com.stockpile.platform.orm.repository;

import com.stockpile.platform.orm.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country,Long> {

    Country findByCode(String code);
}
