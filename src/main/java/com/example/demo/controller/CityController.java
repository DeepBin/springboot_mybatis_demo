
    /**  
    * @Title: CityController.java
    * @Package com.example.demo.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月10日
    * @version V1.0  
    */
    
package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

/**
    * @ClassName: CityController
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author wjk
    * @date 2018年5月10日
    *
    */
@RequestMapping("/city")
@RestController
public class CityController {
	@Resource 
	private  CityService cityService;
	/**
	 * 
	    * @Title: insertValus
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@GetMapping("/insertValues")
	public void insertValus() {
		City city =  new  City();
		city.setCityCode("370000");
		city.setCityName("山东");
		city.setId(2);
		cityService.insertValues(city);
	}
	
	/**
	 * 
	    * @Title: listCity
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return List<City>    返回类型
	    * @throws
	 */
	@GetMapping("/list")
	public List<City> listCity() {
		return  cityService.listCity();
	}
	
	/**
	 * 
	    * @Title: selectByPrimaryKey
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return City    返回类型
	    * @throws
	 */
	@RequestMapping("getCityById")
	public City selectByPrimaryKey() {
		return  cityService.selectByPrimaryKey(1);
	}
}
