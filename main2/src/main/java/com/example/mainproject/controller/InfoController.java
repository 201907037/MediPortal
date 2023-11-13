package com.example.mainproject.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.ListView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mainproject.entity.Details;
import com.example.mainproject.entity.Listview;
import com.example.mainproject.persistence.MedicineDAO;



@Controller
public class InfoController {
	
	@Autowired
	private MedicineDAO mDAO;
	
	@GetMapping("/searchName")
	public String searchGebolin(@RequestParam("name")String mName,Model model) {
		
		mDAO.reSQLSN(mName);
		List<Map<String, Object>> snSearch = mDAO.searchSN();
		Map<String, Object> list = snSearch.get(0);
		int mNum = Integer.parseInt(list.get("mNum").toString());
		
		mDAO.reSQLD(mNum);
		List<Map<String,Object>> dSearch = mDAO.searchD();
		
		Map<String, Object> result = dSearch.get(0);
		
		
		
		Details detail = new Details();
		
		
		
		detail.setmNum2(Integer.parseInt(result.get("mNum2").toString()));
		detail.setEfficacy(result.get("Efficacy").toString());
		detail.setFormulation(result.get("Formulation").toString());
		detail.setAppearance(result.get("Appearance").toString());
		detail.setAdministration(result.get("Administration").toString());
		detail.setMediInfo1(result.get("MediInfo1").toString());
		detail.setMediInfo2(result.get("MediInfo2").toString());
		detail.setMediInfo3(result.get("MediInfo3").toString());
		detail.setMediInfo4(result.get("MediInfo4").toString());
		detail.setPicture(result.get("Picture").toString());
		detail.setHow(result.get("How").toString());
		
		model.addAttribute("name", mName);
		model.addAttribute("detail", detail);
		
		return "/source/searchView";
	}
}
