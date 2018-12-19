package com.deweyliu.spring.cloud.weather.modules.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * City Data Controller
 *
 * @author DeweyLiu
 * @version 1.0.0
 * @date 2018/12/18 20:06
 */

@RestController
@RequestMapping("/cities")
public class CityDataController {
    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }
}
