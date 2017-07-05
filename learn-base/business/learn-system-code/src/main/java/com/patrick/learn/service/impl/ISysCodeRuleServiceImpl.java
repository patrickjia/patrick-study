package com.patrick.learn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrick.learn.common.DateFormart;
import com.patrick.learn.common.NumberUtil;
import com.patrick.learn.common.StringUtil;
import com.patrick.learn.dao.ISysCodeRuleDao;
import com.patrick.learn.entity.SysCodeRule;
import com.patrick.learn.service.ISysCodeRuleService;


/**
 * 
 * @author caspar.chen
 * @date 2016-11-24
 */
@Service
public class ISysCodeRuleServiceImpl  implements ISysCodeRuleService{

	@Autowired
	private ISysCodeRuleDao sysCodeRuleDao;
	
	//重置规则，年，月，日
	private static int RESET_RULE_YEAR = 1;
	private static int RESET_RULE_MONTH = 2;
	private static int RESET_RULE_DAY = 3;
	
	

	//@Override
	public boolean deleteByPrimaryKey(String sysCodeRuleId) {
		return sysCodeRuleDao.deleteByPrimaryKey(sysCodeRuleId) != 0 ? true : false;
	}

	//@Override
	public boolean insertSelective(SysCodeRule record) {
		return sysCodeRuleDao.insertSelective(record) != 0 ? true : false;
	}

	//@Override
	public SysCodeRule selectByPrimaryKey(String sysCodeRuleId) {
		return sysCodeRuleDao.selectByPrimaryKey(sysCodeRuleId);
	}

	//@Override
	public List<SysCodeRule> selectByCondition(SysCodeRule record) {
		return sysCodeRuleDao.selectByCondition(record);
	}

	//@Override
	public boolean updateByPrimaryKeySelective(SysCodeRule record) {
		return sysCodeRuleDao.updateByPrimaryKeySelective(record) != 0 ? true : false;
	}

	//@Override
	public String getCode(String ruleId) {
		SysCodeRule rule = selectByPrimaryKey(ruleId);
		StringBuffer result = new StringBuffer();

		if(StringUtil.isNotEmpty(rule.getPrefix())){
			// 前缀
			result.append(rule.getPrefix());
		}
		
		// 日期规则 1:年，2:年月，3:年月日
		switch (rule.getDateRule()) {
		case 1:
			result.append(DateFormart.getNowYYYY());
			break;
		case 2:
			result.append(DateFormart.getNowYYYYMM());
			break;
		case 3:
			result.append(DateFormart.getNowYYYYMMDD());
			break;
		default:

			break;
		}

		if(StringUtil.isNotEmpty(rule.getDateSuffix())){
			// 日期后缀
			result.append(rule.getDateSuffix());
		}

		// 流水号数字 
		result.append(processNum(rule));

		if(StringUtil.isNotEmpty(rule.getSuffix())){
			// 后缀
			result.append(rule.getSuffix());
		}
		
		// CurrentNum + 1
		SysCodeRule resetRule = new SysCodeRule();
		resetRule.setId(rule.getId());
		resetRule.setCurrentNum(rule.getCurrentNum() + 1);
		updateByPrimaryKeySelective(resetRule);
		
		return result.toString();
	}
	
	
	/**
	 * 构建流水号数字
	 * 
	 * @param SysCodeRule
	 * @return String
	 * @see processNum
	 */
	private String processNum(SysCodeRule rule) {
		StringBuffer num = new StringBuffer();
		// 1.不够位数补0
		String numPre = NumberUtil.getNumberPrefix0(rule.getCurrentNum(), rule.getLengthNum());
		
		// 2.重置规则
		// 重置日期不是当前天，并且当前天为重置规则的天(年/月/日)
		if (!DateFormart.getNowYYYYMMDD().equals(rule.getResetDate()) && rule.getResetRule() != 0) {
			if((rule.getResetRule() == RESET_RULE_YEAR && DateFormart.isFirstDayOfYear())
					||(rule.getResetRule() == RESET_RULE_MONTH && DateFormart.isFirstDayOfMonth())
					||rule.getResetRule() == RESET_RULE_DAY){
				
				numPre = NumberUtil.getNumberPrefix0(rule.getStartNum(), rule.getLengthNum());
				// 重置当前num ，设置重置日期为当天
				SysCodeRule resetRule = new SysCodeRule();
				resetRule.setId(rule.getId());
				resetRule.setCurrentNum(0);
				resetRule.setResetDate(DateFormart.getNowYYYYMMDD());
				updateByPrimaryKeySelective(resetRule);
			}
		}

		num.append(numPre);
		// 3.加1
		num.append(rule.getCurrentNum() + 1);
		
		return num.toString();
	}


}
