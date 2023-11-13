package com.example.mainproject.persistence;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MedicineDAO {
	@Autowired
	private JdbcTemplate spring;
	private final static String M_List
		= "select * from medicine";
	private String K_str;
	private String D_str;
	private String SN_str;
	
	public List<Map<String, Object>> getList(){
		return spring.queryForList(M_List);
	}
	
	public void reSQLM(String keyword) {
		//K_str = "select * from medicine where mName like"+"'"+keyword+"%'";
		K_str = "select * from searchlistview where mName like"+"'%"+keyword+"%'";
		
	}
	
	public void reSQLD(int num) {
		D_str = "select * from details where mNum2 ="+num;
	}
	
	public void reSQLSN(String name) {
		SN_str = "select mNum from searchlistview where mName="+"'"+name+"'";
	}
	
	public List<Map<String , Object>> searchM(){
		return spring.queryForList(K_str);
	}
	
	public List<Map<String, Object>> searchD(){
		return spring.queryForList(D_str);
	}
	
	public List<Map<String,Object>> searchSN(){
		return spring.queryForList(SN_str);
	}
}
