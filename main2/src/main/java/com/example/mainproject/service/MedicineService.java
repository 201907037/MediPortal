package com.example.mainproject.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.example.mainproject.persistence.MedicineDAO;
@Service
public class MedicineService implements ApplicationRunner {
	@Autowired
	private MedicineDAO mDAO;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<String, Object> medicine
			= new HashMap<String, Object>();
		List<Map<String, Object>> MList = mDAO.getList();
		for (Map<String, Object> result : MList) {
			System.out.println("---->"+result.toString());
		}

	}

}
