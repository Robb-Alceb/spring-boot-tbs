package com.hk3t.techson.springboottbs.controller;



import com.hk3t.techson.springboottbs.bean.City;
import com.hk3t.techson.springboottbs.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController{
	@Autowired
	@Qualifier(value="cityService")
	private CityService cityService;

	@RequestMapping("getAll")
	public Object getCity(){
		try {
			List<City> cityList = this.cityService.getCity();
			return cityList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
