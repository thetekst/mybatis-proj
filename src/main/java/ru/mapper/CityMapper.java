package ru.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ru.model.City;

/**
 * @author Dmitry Tkachenko
 * 11.01.18
 */
@Mapper
public interface CityMapper {

    @Select("select * from ${db-var2} where state = #{state}")
    City findByState(@Param("state") String state);
}
