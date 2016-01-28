package com.demo.web.tests;
import java.sql.SQLException;

import com.demo.web.controllers.*;
import com.demo.web.models.*;
import com.demo.web.daos.*;
public class TestIbatis {
	public static void main(String[] args) throws SQLException { 
		Record record = new Record();
		RecordDAOImpl redimp=new RecordDAOImpl();
		record.setUseuser(1);
		redimp.insert(record);
		System.out.println("finished!");
	}
}
