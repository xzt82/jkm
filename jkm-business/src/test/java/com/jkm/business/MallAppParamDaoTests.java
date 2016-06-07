package com.jkm.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jkm.business.entity.MallAppParam;
import com.jkm.business.service.MallAppParamService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class MallAppParamDaoTests {
	@Autowired
	MallAppParamService repository;

	@Test
	public void findsFirstPageOfCities() {

		MallAppParam mallAppParamSearch = new MallAppParam();
		Page<MallAppParam> cities = this.repository.findMallAppParams(mallAppParamSearch,new PageRequest(0, 10));
		
		assert(cities.getTotalElements()>0);
	}
}
