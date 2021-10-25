package com.service;

import com.dao.DBDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService {

	public void setDAO(DBDAO dao) {//interface 타입 매개변수
		//dao.connectOracle();
		//dao.connectMySQL();
	      dao.connect(); //오버리딩 함수 호출
	}

	public void setDAO(MySQLDAO dao) {
		// TODO Auto-generated method stub
		
	}

	public void setDAO(OracleDAO dao) {
		// TODO Auto-generated method stub
		
	}
}
