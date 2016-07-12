package com.muran.dao;

import com.muran.dao.operation.IOperations;
import com.muran.model.Activity;
import com.muran.model.ActivitySignup;
import com.muran.util.Data;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

/**
 * @author jerry.zheng
 * @version 创建时间：2016年7月12日 下午4:12:52 类说明
 */
public interface IActivitySignUpDao extends IOperations<ActivitySignup> {
	public int getSignUpNum(Long autoId);

	public ActivitySignup getOneByOpenId(Long activity, String openid);
	
	public Data<ActivitySignup> getActivitySignupPageList(Long autoId, Integer pageSize, Integer pageIdex);
}
