package com.patrick.learn.service;

import java.util.List;
import java.util.Map;

import com.patrick.learn.entity.Position;


/**
 * 管理岗位的基础数据
 * 包括岗位的展示、增加、删除、修改以及导出功能
 * @author    caspar.chen
 * @version   1.0.0, 2016年10月30日
 * @see       IPositionService
 * @since     [产品/模块版本] 
 */
public interface IPositionService{
	
    /**
	 * 
	 * 查询分页
	 * 〈功能详细描述〉
	 * @param  map  [参数1说明]
	 * @return Map
	 * @exception/throws [违例类型] [违例说明]
	 * @see          getDepartmentPage
	 */
	Map<String, Object>  getPositionPage(Map<String, String> map);
	
	/**
	 * 
	 * 根据条件查询岗位信息
	 * 〈功能详细描述〉
	 * @param  record   岗位对象
	 * @return List<Position>
	 * @see          selectByCondition
	 */
    List<Position> selectByCondition(Position record);
    
    /**
	 * 
	 * 根据岗位编码查询岗位信息
	 * 〈功能详细描述〉
	 * @param  postId   岗位编码
	 * @param  [参数2]   [参数2说明]
	 * @return Postion
	 * @exception/throws [违例类型] [违例说明]
	 * @see          selectByPrimaryKey
	 */
    Position selectByPrimaryKey(String postId);

    /**
   	 * 
   	 * 查询人员岗位信息
   	 * 根据人员ID查询相关联的岗位集合信息
   	 * @param  personId   人员ID
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Department>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectPostionByPerson
   	 */
    List<Position> selectPostionByPerson(String personId);
    
  
}
