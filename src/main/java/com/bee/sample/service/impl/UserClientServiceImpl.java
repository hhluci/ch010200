package com.bee.sample.service.impl;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;

public class UserClientServiceImpl implements UserClientService {

	@Override
	public void saveCustom() {
		

		System.out.println("���ڵ���:"+this.getClass().getName());
		
		UserClientDao userClientDao = new UserClientDaoImpl();
		userClientDao.saveCustom();
		
	}

}
