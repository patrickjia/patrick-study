package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.BusSystem;


/**
 * 管理业务系统的基础数据 包括业务系统的展示、增加、删除、修改以及导出功能
 */
public interface IBusSystemService  {

	/**
	 * 
	 * 查询分页 〈功能详细描述〉
	 * 
	 * @param map
	 *            [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see getBusSystemPage
	 */
	Map<String, Object> getBusSystemPage(Map<String, String> map);

	/**
	 * 查询业务系统信息
	 * 
	 * @param busSystem
	 * @return List<BusSystem>
	 * @see [类、类#方法、类#成员]
	 */
	List<BusSystem> selectByCondition(BusSystem busSystem);

	/**
	 * 
	 * 根据业务系统编码删除业务系统 〈功能详细描述〉
	 * 
	 * @param busSystemId
	 *            业务系统编码
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see deleteByPrimaryKey
	 */
	boolean deleteByPrimaryKey(String busSystemId);


	/**
	 * 
	 * 插入业务系统信息 插入时会判断功能属性值是否为空，不为空的插入数据库
	 * 
	 * @param record
	 *            业务系统对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see insertSelective
	 */
	boolean insertSelective(BusSystem record);

	/**
	 * 
	 * 根据业务系统编码查询业务系统信息 〈功能详细描述〉
	 * 
	 * @param busSystemId
	 *            功能编码
	 * @param [参数2] [参数2说明]
	 * @return BusSystem
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectByPrimaryKey
	 */
	BusSystem selectByPrimaryKey(String busSystemId);

	/**
	 * 
	 * 更新业务系统信息 更新时会判断功能属性值是否为空，不为空的更新数据库
	 * 
	 * @param record
	 *            业务系统对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see updateByPrimaryKeySelective
	 */
	boolean updateByPrimaryKeySelective(BusSystem record);

	/**
	 * 
	 * 更新业务系统信息
	 * 
	 * @param record
	 *            业务系统对象
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see updateByPrimaryKey
	 */
	boolean updateByPrimaryKey(BusSystem record);

	/**
	 * 查询appcode列表
	 * 
	 * @param [参数1] [参数1说明]
	 * @param [参数2] [参数2说明]
	 * @return [返回类型说明]
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	List<BusSystem> getAppcodeFromBusSytem(BusSystem busSystem);
	
	/**
	 * 
	 * 根据人员编码获取人员所能访问的系统列表
	 * 
	 * @param personCode 人员Id
	 * @return [返回类型说明]
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	List<BusSystem> getBusSystemByPerson(String personCode);
}
