package com.bee.sample.client;

import com.bee.sample.service.UserClientService;
import com.bee.sample.service.impl.UserClientServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		UserClientService userClientService = new UserClientServiceImpl();

		userClientService.saveCustom();
		
		//Client °¢ UserClientService°¢UserClientServiceImpl «ø“¿¿µπÿœµ
	}

}
