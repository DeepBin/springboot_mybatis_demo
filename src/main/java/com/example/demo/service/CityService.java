
    /**  
    * @Title: CityService.java
    * @Package com.example.demo.service
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月10日
    * @version V1.0  
    */
    
package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.CityMapper;
import com.example.demo.model.City;

/**
    * @ClassName: CityService
    * @Description: CityService 业务逻辑处理类
    * @author wjk
    * @date 2018年5月10日
    *
    */
@Service
public interface CityService {
	/**
	 * 
	    * @Title: insertValues
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param city    参数
	    * @return void    返回类型
	    * @throws
	 */
	public void insertValues(City city);
	/**
	 * 
	    * @Title: listCity
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return List<City>    返回类型
	    * @throws
	 */
	public List<City> listCity();
	/**
	 * 
	    * @Title: selectByPrimaryKey
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param primaryKey
	    * @param @return    参数
	    * @return City    返回类型
	    * @throws
	 */
	public City  selectByPrimaryKey(int primaryKey);
}
