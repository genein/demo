package com.example.demo.mapper;

import com.example.demo.domain.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * mapper层相当于DAO层，该类接口不需要实现类，本身已经继承了很多方法，也可以根据自己的需要增加方法.
 */
@Mapper
public interface CountryMapper extends tk.mybatis.mapper.common.Mapper<Country> {

    @Select("select * from country where country_name = #{countryName}")
    Country selectByCountryName(String countryName);
}
