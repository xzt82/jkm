package com.jkm.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jkm.business.entity.MallAppParam;
import com.jkm.business.service.MallAppParamService;

//@RestController 
@Controller
@RequestMapping("/appParam") 
public class AppParamController {
	
	@Autowired
	private MallAppParamService mallAppParamService;
	@RequestMapping("/{id}")  
	@ResponseBody
	@Transactional(readOnly = true)
    public Page<MallAppParam> view(@PathVariable("id") String id) {  
		
        MallAppParam mallAppParam = new MallAppParam();  
        mallAppParam.setAppVersion("1.7.1");
        mallAppParam.setId(id);
        mallAppParam.setMobileOs("android");
        mallAppParam.setParamName("enableUser");
        mallAppParam.setParamValue("1");
        mallAppParam.setUpdateDate(new Date());
        Page<MallAppParam> page = this.mallAppParamService.findMallAppParams(mallAppParam, null);
        return page;  
    }  
}
