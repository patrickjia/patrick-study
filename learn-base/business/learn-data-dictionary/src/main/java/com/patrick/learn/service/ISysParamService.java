package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.SysParam;


/**
 * 管理角色的基础数据
 * 包括角色的展示、增加、删除、修改以及导出功能
 * @author    caspar.chen
 * @version   1.0.0, 2016年11月10日
 * @see       IPositionService
 * @since     [产品/模块版本] 
 */
public interface ISysParamService   {
	/**
	 * 
	 * 根据系统参数编码删除系统参数
	 * 〈功能详细描述〉
	 * @param  sysParamId   系统参数编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
    boolean deleteByPrimaryKey(String sysParamId);

  
    /**
	 * 
	 * 插入系统参数信息
	 * 〈功能详细描述〉
	 * @param  record   系统参数对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSysParam
	 */
    boolean insertSysParam(SysParam record);

    /**
	 * 
	 * 插入系统参数信息
	 * 插入时会判断系统参数属性值是否为空，不为空的插入数据库
	 * @param  record   系统参数对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    boolean insertSelective(SysParam record);

    /**
	 * 
	 * 根据系统参数编码查询系统参数信息
	 * 〈功能详细描述〉
	 * @param  sysParamId   系统参数编码
	 * @param  [参数2]   [参数2说明]
	 * @return SysParam
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    SysParam selectByPrimaryKey(String sysParamId);

    /**
	 * 
	 * 查询分页
	 * 〈功能详细描述〉
	 * @param  map  [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see          getSysParamPage
	 */
	Map<String, Object>  getSysParamPage(Map<String, String> map);
    
	/**
	 	* 查询
		* @param record SysParam
		* @return [返回类型说明]
		* @exception/throws [违例类型] [违例说明]
		* @see [类、类#方法、类#成员]
	 */
	SysParam selectByCondition(SysParam record);
	
	/**
 	* 查询
	* @param record SysParam
	* @return [返回类型说明]
	* @exception/throws [违例类型] [违例说明]
	* @see [类、类#方法、类#成员]
	*/
	List<SysParam> selectListByCondition(SysParam record);

    /**
   	 * 
   	 * 更新系统参数信息
   	 * 更新时会判断系统参数属性值是否为空，不为空的更新数据库
   	 * @param  record   系统参数对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    boolean updateByPrimaryKeySelective(SysParam record);

    /**
   	 * 
   	 * 更新系统参数信息
   	 * 
   	 * @param  record   系统参数对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    boolean updateByPrimaryKey(SysParam record);
    
    /**
     * 查询系统参数树
	 * @param  [参数2]   [参数2说明]
	 * @return List<SysParam>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectSysParamTree
     */
    List<SysParam> selectSysParamTree();
}
