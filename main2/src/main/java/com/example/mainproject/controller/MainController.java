package com.example.mainproject.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.ListView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mainproject.entity.Details;
import com.example.mainproject.entity.Medicine;
import com.example.mainproject.entity.Listview;
import com.example.mainproject.persistence.MedicineDAO;

@Controller
public class MainController {
	
	@Autowired
	private MedicineDAO mDAO;
	
   
	 @GetMapping("/main")
	   public String goTest() {
		   return "/main";
	   }
	 @GetMapping("/notice")
	   public String goNotice() {
		   return "/source/notice";
	   }
	 @GetMapping("/showS")
	   public String goShowS(Model model) {
		 model.addAttribute("rightFrameSrc", "/Snomal");
		   return "/source/showS";
	   }
		
	   
	   @PostMapping("/searchList")
	   public String SearchGo(@RequestParam("search")String keyword, Model model) {
		 
		   mDAO.reSQLM(keyword);
		   int i = 1;
		  
		   List<Map<String, Object>> mSearch = mDAO.searchM();
		   List<Listview> mlist = new ArrayList<Listview>();
		   
		   if(mSearch.isEmpty()) {
			   model.addAttribute("name", keyword);
			   return "/source/noResult";
		   }
		   else {
			  
			   
			   for (Map<String, Object> result : mSearch) {
					
					int mNum = Integer.parseInt(result.get("mNum").toString());
				   	String mName = result.get("mName").toString();
				   	String picture = result.get("Picture").toString();
				    Listview lsv = new Listview();
				   	lsv.setSeq(i);
				   	lsv.setmNum(mNum);
				   	lsv.setmName(mName);
				   	lsv.setPicture(picture);
				   	
				   	mlist.add(lsv);
					i++;
				}
				   model.addAttribute("list", mlist);
				   model.addAttribute("name", keyword);
				   return "/source/searchList";
		   }
	   }
	  
	   @GetMapping("/searchView")
	   public String showView(@RequestParam(value="num")int mnum,@RequestParam(value="name")String keyword,Model model) {
		   model.addAttribute("mNum",mnum );
		   model.addAttribute("name", keyword);
		   mDAO.reSQLD(mnum);
		   Details detail = new Details();
		   List<Map<String, Object>> dList = mDAO.searchD();
		   Map<String, Object> result = dList.get(0);
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
		   
		   model.addAttribute("detail", detail);
			/*
			 * List<Details> d = new ArrayList<Details>(); d.add(detail);
			 * model.addAttribute("list", d);
			 */
		   return "/source/searchView";
	   }
}
