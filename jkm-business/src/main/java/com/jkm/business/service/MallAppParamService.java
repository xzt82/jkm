package com.jkm.business.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jkm.business.entity.MallAppParam;

public interface MallAppParamService {
	
	public Page<MallAppParam> findMallAppParams(MallAppParam criteria, Pageable pageable);
}
