package com.mxdx.chlm;
//父类：订餐系统类
public class DinCanSystem {
	//数据主体信息：订餐人，所定餐品信息，份数，送餐时间，送餐地址，金额，订单状态
		String[] name = new String[4];
		String[] canPin = new String[4];
		int[] fenShu = new int[4];
		int[] time = new int[4];  //10:00-18:00
		String[] adress = new String[4]; 
		double[] Price = new double[4];
		int[] state = new int[4]; //0：已预订  1：已签收
		double[] numPrice = new double[4];
		
}
