package com.dreamonly.db.dao;

import com.dreamonly.db.model.CountryLanguage;
import com.dreamonly.db.model.CountryLanguageKey;

public interface CountryLanguageMapper {
    int deleteByPrimaryKey(CountryLanguageKey key);

    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);

    CountryLanguage selectByPrimaryKey(CountryLanguageKey key);

    int updateByPrimaryKeySelective(CountryLanguage record);

    int updateByPrimaryKey(CountryLanguage record);
}