package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.SysCodeRule;


/**
 * 
 * 系统编码规则管理数据访问层 对系统编码规则进行增、删、改、查等操作
 * 
 * @author caspar.chen
 * @version 1.0.0, 2016年11月24日
 * @see ISysCodeRuleDao
 */
public interface ISysCodeRuleDao  {
	/**
	 * 
	 * 根据系统编码规则编码删除系统编码规则 〈功能详细描述〉
	 * 
	 * @param sysCodeRuleId
	 *            系统编码规则id
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see deleteByPrimaryKey
	 */
	int deleteByPrimaryKey(String sysCodeRuleId);

	/**
	 * 
	 * 插入系统编码规则信息 〈功能详细描述〉
	 * 
	 * @param record
	 *            系统编码规则对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see insert
	 */
	int insert(SysCodeRule record);

	/**
	 * 
	 * 插入系统编码规则信息 插入时会判断系统编码规则属性值是否为空，不为空的插入数据库
	 * 
	 * @param record
	 *            系统编码规则对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see insertSelective
	 */
	int insertSelective(SysCodeRule record);

	/**
	 * 
	 * 根据系统编码规则编码查询系统编码规则信息 〈功能详细描述〉
	 * 
	 * @param sysCodeRuleId
	 *            系统编码规则编码
	 * @param [参数2] [参数2说明]
	 * @return SysCodeRule
	 * @exception/throws [违例类型] [违例说明]
	 * @see selectByPrimaryKey
	 */
	SysCodeRule selectByPrimaryKey(String sysCodeRuleId);

	/**
	 * 
	 * 根据条件查询系统编码规则信息 〈功能详细描述〉
	 * 
	 * @param record
	 *            系统编码规则对象
	 * @return List<SysCodeRule>
	 * @see selectByCondition
	 */
	List<SysCodeRule> selectByCondition(SysCodeRule record);

	/**
	 * 
	 * 更新系统编码规则信息 更新时会判断系统编码规则属性值是否为空，不为空的更新数据库
	 * 
	 * @param record
	 *            系统编码规则对象
	 * @param [参数2] [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see updateByPrimaryKeySelective
	 */
	int updateByPrimaryKeySelective(SysCodeRule record);
}
