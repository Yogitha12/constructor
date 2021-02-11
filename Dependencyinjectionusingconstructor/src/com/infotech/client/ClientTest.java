package com.infotech.client;

import com.infotech.service.Communication;

public class ClientTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Communication communication=ctx.getBean("communication",Communication.class);
		communication.communicate();
		ctx.close();
	}

}
