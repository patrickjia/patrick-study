/*
 * 项目名：wicbase 	
 * 文件名：IPostionDao.java
 * 包名: com.wicresoft.platform.dao 	
 * 版权： Copyright 2016 Wicresoft Co. Ltd. All Rights Reserved.
 * 描述：岗位管理数据访问层
 * 修改人：patrick
 * 修改时间：2016年9月14日
 * 修改单号：WS00001
 * 修改内容：〈修改内容〉
 */
package com.patrick.learn.dao;

import java.util.List;

import com.patrick.learn.entity.Position;

/**
 * 
 * 岗位管理数据访问层
 * 对岗位进行增、删、改、查等操作
 * @author    patrick
 * @version   1.0.0, 2016年9月14日
 * @see       IPositionDao
 * @since     [产品/模块版本]
 */
public interface IPositionDao {
	/**
	 * 
	 * 根据岗位编码删除岗位
	 * 〈功能详细描述〉
	 * @param  postId   岗位编码
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see          deleteByPrimaryKey
	 */
	int deleteByPrimaryKey(String postId);

	/**
	 * 
	 * 插入岗位信息
	 * 〈功能详细描述〉
	 * @param  record   岗位对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insert
	 */
    int insert(Position record);

    /**
	 * 
	 * 插入岗位信息
	 * 插入时会判断岗位属性值是否为空，不为空的插入数据库
	 * @param  record   岗位对象
	 * @param  [参数2]   [参数2说明]
	 * @return int
	 * @exception/throws [违例类型] [违例说明]
	 * @see         insertSelective
	 */
    int insertSelective(Position record);

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
	 * 根据条件查询岗位信息
	 * 〈功能详细描述〉
	 * @param  record   岗位对象
	 * @return List<Position>
	 * @see          selectByCondition
	 */
    List<Position> selectByCondition(Position record);
    
    
    
    /**
   	 * 
   	 * 查询人员岗位信息
   	 * 根据人员ID查询相关联的岗位集合信息
   	 * @param  personId   人员ID
   	 * @param  [参数2]   [参数2说明]
   	 * @return List<Postion>
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          selectPostionByPerson
   	 */
    List<Position> selectPostionByPerson(String personId);
    
    
    /**
   	 * 
   	 * 更新岗位信息
   	 * 更新时会判断岗位属性值是否为空，不为空的更新数据库
   	 * @param  record   岗位对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKeySelective
   	 */
    int updateByPrimaryKeySelective(Position record);

    /**
   	 * 
   	 * 更新岗位信息
   	 * 
   	 * @param  record   岗位对象
   	 * @param  [参数2]   [参数2说明]
   	 * @return int
   	 * @exception/throws [违例类型] [违例说明]
   	 * @see          updateByPrimaryKey
   	 */
    int updateByPrimaryKey(Position record);
}