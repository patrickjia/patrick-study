/*
 * 项目名：wicbase 	
 * 文件名：IDepartmentService.java
 * 包名: com.wicresoft.platform.service  	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：管理组织的基础数据
 * 修改人：patrick
 * 修改时间：2016年9月12日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */

package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Function;
import com.patrick.learn.entity.Menu;


/**
 * 管理菜单的基础数据
 * 包括菜单的展示、增加、删除、修改以及导出功能
 * @author    patrick
 * @version   1.0.0, 2016年9月12日
 * @see       IMenusService
 * @since     [产品/模块版本] 
 */

public interface IMenusService {

	
	/**
     * 查询菜单树
	 * @param  menusId   父节点
	 * @param  [参数2]   [参数2说明]
	 * @return List<Department>
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectMenusTree
     */
    List<Menu> selectMenusTree(Menu menu);

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
	
	Map<String, Object> getMenuPage(Map<String, String> map);

	

	List<Menu> checkMenuCode(String menuCode);

	List<Function> checkFunctionCode(String menuId, List<String> funcCode);

	Menu selectByMenuCode(String menuCode);

	Menu selectByMenuId(String superiorMenuId);

	boolean deleteMenu(String menuId);
	
	List<Function> selectFunctionByMenuId(String menuId);
}
