/*
 * 项目名：wicbase 	
 * 文件名：IMenuDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：菜单管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.Menu;


/**
 * 
 * 菜单管理数据访问层
 * 对菜单进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IMenuDao
 * @since     [产品/模块版本]
 */
public interface IMenuDao {
	/**
	 * 
	 * 根据菜单编码删除菜单
	 * 〈功能详细描述〉
	 * @param  menuId   菜单编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
    int deleteByPrimaryKey(String menuId);

    /**
	 * 
	 * 插入菜单信息
	 * 〈功能详细描述〉
	 * @param  record   菜单对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(Menu record);

    /**
	 * 
	 * 插入菜单信息
	 * 插入时会判断菜单属性值是否为空，不为空的插入数据库
	 * @param  record   菜单对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(Menu record);

    /**
	 * 
	 * 根据菜单编码查询菜单信息
	 * 〈功能详细描述〉
	 * @param  menuId   菜单编码
	 * @param  [参数2]   [参数2说明]
	 * @return Menu
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Menu selectByPrimaryKey(String menuId);
    
    /**
	 * 
	 * 根据菜单编码查询菜单信息
	 * 〈功能详细描述〉
	 * @param  menu   菜单
	 * @param  [参数2]   [参数2说明]
	 * @return Menu
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectMenuTree
	 */
    List<Menu> selectMenuTree(Menu menu);

    /**
   	 * 
   	 * 更新菜单信息
   	 * 更新时会判断菜单属性值是否为空，不为空的更新数据库
   	 * @param  record   菜单对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    int updateByPrimaryKeySelective(Menu record);

    /**
   	 * 
   	 * 更新菜单信息
   	 * 
   	 * @param  record   菜单对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    int updateByPrimaryKey(Menu record);
    
    /**
   	 * 
   	 * 菜单属性信息查询满足条件的菜单集合信息
   	 * 部门查询条件:MENU_CODE、MENU_NAME、IS_ENABLED,进行模糊查询
   	 * @param  record   部门对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Menu>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectByCondition
   	 */
	List<Menu> selectByCondition(Menu menu);

	List<Menu> selectByMenuCode(String menuCode);

    int updateByMenuCode(Menu record);
}