/*
 * 项目名：wicbase 	
 * 文件名：IFunctionDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：功能管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Function;


/**
 * 
 * 功能管理数据访问层
 * 对功能进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IFunctionDao
 * @since     [产品/模块版本]
 */
public interface IFunctionDao {
	/**
	 * 
	 * 根据功能编码删除功能
	 * 〈功能详细描述〉
	 * @param  functionId   功能编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
    int deleteByPrimaryKey(String functionId);

    /**
	 * 
	 * 插入功能信息
	 * 〈功能详细描述〉
	 * @param  record   功能对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(Function record);

    /**
	 * 
	 * 插入功能信息
	 * 插入时会判断功能属性值是否为空，不为空的插入数据库
	 * @param  record   部门对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(Function record);

    /**
	 * 
	 * 根据功能编码查询功能信息
	 * 〈功能详细描述〉
	 * @param  functionId   功能编码
	 * @param  [参数2]   [参数2说明]
	 * @return Function
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Function selectByPrimaryKey(String functionId);

    /**
   	 * 
   	 * 更新功能信息
   	 * 更新时会判断功能属性值是否为空，不为空的更新数据库
   	 * @param  record   部门对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    int updateByPrimaryKeySelective(Function record);

    /**
   	 * 
   	 * 更新功能信息
   	 * 
   	 * @param  record   部门对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    int updateByPrimaryKey(Function record);

	List<Function> checkFunctionCode(Map<String, Object> map);

	List<Function> selectByMenuId(String menuId);

	int deleteByMenuId(String menuId);
}