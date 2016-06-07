package com.jkm.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jkm.business.dao.MallAppParamDao;
import com.jkm.business.entity.MallAppParam;
import com.jkm.business.service.MallAppParamService;

@Service
@Transactional
public class MallAppParamServiceImpl implements MallAppParamService {
	@Autowired
	private MallAppParamDao mallAppParamDao;
	
	public Page<MallAppParam> findMallAppParams(MallAppParam criteria, Pageable pageable){
		//String mobileOs = criteria.getMobileOs();

		/*if (!StringUtils.hasLength(mobileOs)) {
			return this.mallAppParamDao.findAll(pageable);
		}*/
		//return criteria;
		return this.mallAppParamDao.findAll(pageable);

		/*String country = "";
		int splitPos = name.lastIndexOf(",");

		if (splitPos >= 0) {
			country = name.substring(splitPos + 1);
			name = name.substring(0, splitPos);
		}

		return this.cityRepository
				.findByNameContainingAndCountryContainingAllIgnoringCase(name.trim(),
						country.trim(), pageable);*/
	}
}
