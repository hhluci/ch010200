package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;
/**
 * 问题：分析类间的依赖关系，引出问题；
 * 方案：为了减少它们之间的依赖需要采取解耦策略
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		
		UserClientService userClientService = new UserClientServiceImpl();

		userClientService.saveCustom();
		
		//Client 、 UserClientService、UserClientServiceImpl 强依赖关系
	}

}
