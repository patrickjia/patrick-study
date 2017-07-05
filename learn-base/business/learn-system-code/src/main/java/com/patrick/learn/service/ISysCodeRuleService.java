package com.patrick.learn.service;

import java.util.List;

import com.patrick.learn.entity.SysCodeRule;


/**
 * 
 * @author caspar.chen
 * @date 2016-11-24
 */
public interface ISysCodeRuleService  {
	/**
	 * 
	 * 根据系统编码规则编码删除系统编码规则 〈功能详细描述〉
	 * 
	 * @param sysCodeRuleId
	 *            系统编码规则id
	 * @param [参数2] [参数2说明]
	 * @return boolean
	 * @exception/throws [违例类型] [违例说明]
	 * @see deleteByPrimaryKey
	 */
	boolean deleteByPrimaryKey(String sysCodeRuleId);

	/**
	 * 
	 * 插入系统编码规则信息 插入时会判断系统编码规则属性值是否为空，不为空的插入数据库
	 * 
	 * @param record
	 *            系统编码规则对象
	 * @param [参数2] [参数2说明]
	 * @return boolean
	 * @exception/throws [违例类型] [违例说明]
	 * @see insertSelective
	 */
	boolean insertSelective(SysCodeRule record);

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
	 * @return boolean
	 * @exception/throws [违例类型] [违例说明]
	 * @see updateByPrimaryKeySelective
	 */
	boolean updateByPrimaryKeySelective(SysCodeRule record);

	/**
	 * 获取code
	 * 
	 * @param ruleId
	 *            规则ID
	 * @return String
	 * @exception/throws [违例类型] [违例说明]
	 * @see [类、类#方法、类#成员]
	 */
	String getCode(String ruleId);
}
