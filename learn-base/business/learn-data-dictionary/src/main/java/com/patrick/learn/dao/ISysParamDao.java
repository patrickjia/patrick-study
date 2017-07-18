/*
 * 项目名：wicbase 	
 * 文件名：ISysParamDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：系统参数管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.SysParam;


/**
 * 
 * 系统参数管理数据访问层
 * 对系统参数进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       ISysParamDao
 * @since     [产品/模块版本]
 */
public interface ISysParamDao {
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
    int deleteByPrimaryKey(String sysParamId);

    /**
	 * 
	 * 插入系统参数信息
	 * 〈功能详细描述〉
	 * @param  record   系统参数对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(SysParam record);

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
    int insertSelective(SysParam record);

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
	 * 根据条件查询系统参数信息
	 * 〈功能详细描述〉
	 * @param  record   系统参数对象
	 * @return List<SysParam>
	 * @see          selectByCondition
	 */
    List<SysParam> selectByCondition(SysParam record);
    
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
    int updateByPrimaryKeySelective(SysParam record);

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
    int updateByPrimaryKey(SysParam record);
    
    
    /**
     * 查询系统参数树
	 * @param  [参数2]   [参数2说明]
	 * @return List<SysParam>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectSysParamTree
     */
    List<SysParam> selectSysParamTree();
}