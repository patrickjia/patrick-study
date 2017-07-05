package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.BusSystem;


/**
 * 
 * 业务系统管理数据访问层 对业务系统进行增、删、改、查等操作
 */
public interface IBusSystemDao {

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
	int deleteByPrimaryKey(String busSystemId);

	/**
	 * 
	 * 插入业务系统信息 〈功能详细描述〉
	 * 
	 * @param record
	 *            业务系统对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see insert
	 */
	int insert(BusSystem record);

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
	int insertSelective(BusSystem record);

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
	 * 根据业务系统条件查询业务系统信息 〈功能详细描述〉
	 * 
	 * @param [参数2] [参数2说明]
	 * @return BusSystem
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectByCondition
	 */
	List<BusSystem> selectByCondition(BusSystem record);

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
	int updateByPrimaryKeySelective(BusSystem record);

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
	int updateByPrimaryKey(BusSystem record);

	List<BusSystem> getAppcodeFromBusSytem(BusSystem b);

	/**
	 * 
	 * 根据人员id获取人员所能访问的系统列表
	 * 
	 * @param personCode 人员编码
	 * @return [返回类型说明]
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	List<BusSystem> getBusSystemByPerson(String personCode);

}
