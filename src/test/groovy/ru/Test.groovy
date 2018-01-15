package ru

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import ru.mapper.CityMapper
import spock.lang.Specification

/**
 * @author Dmitry Tkachenko
 * 11.01.18
 */
@SpringBootTest
@AutoConfigureMockMvc
class Test extends Specification {

    @Autowired
    private CityMapper cityMapper

    def 'test'() {
        setup:
        def city = cityMapper.findByState('CA')

        when:
        def cityName = city.name

        then:
        cityName == 'San Francisco'
    }
}
