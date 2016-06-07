package com.jkm.business.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.jkm.business.entity.MallAppParam;

public interface MallAppParamDao extends Repository<MallAppParam, Long> {
	Page<MallAppParam> findAll(Pageable pageable);
}
