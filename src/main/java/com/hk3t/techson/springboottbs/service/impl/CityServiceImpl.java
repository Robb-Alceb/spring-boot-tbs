package com.hk3t.techson.springboottbs.service.impl;

import java.util.List;

import com.hk3t.techson.springboottbs.bean.City;
import com.hk3t.techson.springboottbs.mapper.CityMapper;
import com.hk3t.techson.springboottbs.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	private CityMapper cityMapper;

	@Override
	public List<City> getCity(){
		List<City> cityList = cityMapper.getCity();
		return cityList;
	}
}
