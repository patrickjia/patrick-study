package com.patrick.learn.common.constant;

import com.patrick.learn.common.ConstanHolder;



/**
 * 公共常量定义
 * 
 * @author caspar.chen
 * @version 1.0.0, 2016-9-26
 */

public class CommonConstant {

	/**
	 * spring 主配置文件位置
	 */
	public final static String SPRING_XML_LOCATION = "classpath:config/spring.xml";

	// 启用
	public static final String IS_ENABLE_Y = "0";

	// 停用
	public static final String IS_ENABLE_N = "1";

	// 包含子部门
	public static final String IS_SUB_DEPT_Y = "0";

	// 不包含子部门
	public static final String IS_SUB_DEPT_N = "-1";

	// 查询权限
	public static final String IS_AUTH_Y = "0";

	// 不查询权限
	public static final String IS_AUTH_N = "1";

	// 人员类型-普通人员
	public static final String PERSONAL_TYPE_NORMAR = "1";
	
	// 人员类型-企业用户
	public static final String PERSONAL_TYPE_COMPANY = "2";
	
	//默认分页行数
	public static final int PAGE_DEFAULT_ROW = ConstanHolder.getInteger("page.default.row", 15);
	
}
