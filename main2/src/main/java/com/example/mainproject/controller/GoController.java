package com.example.mainproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoController {

	@GetMapping("/goheadMain") 
	 public String GoHeadMain(Model model) {
		 model.addAttribute("rightFrameSrc", "/head1");
		 return "/source/showS";
		}
	
	 @GetMapping("/goneckMain") 
	 public String GoNeck(Model model) {
		 model.addAttribute("rightFrameSrc", "/neck1");
		 return "/source/showS";
		}
	 @GetMapping("/goshoulderMain") 
	 public String GoSholder(Model model) {
		 model.addAttribute("rightFrameSrc", "/shoulder1");
		 return "/source/showS";
		}
	 @GetMapping("/gochestMain") 
	 public String GoChest(Model model) {
		 model.addAttribute("rightFrameSrc", "/chest1");
		 return "/source/showS";
		}
	 @GetMapping("/gostomachMain") 
	 public String GoBody(Model model) {
		 model.addAttribute("rightFrameSrc", "/stomach1");
		 return "/source/showS";
		}
	 @GetMapping("/golegMain") 
	 public String GoEight(Model model) {
		 model.addAttribute("rightFrameSrc", "/leg1");
		 return "/source/showS";
		}
	 @GetMapping("/gokneeMain") 
	 public String GoElbow(Model model) {
		 model.addAttribute("rightFrameSrc", "/knee1");
		 return "/source/showS";
		}
	 @GetMapping("/gohandMain") 
	 public String GoHand(Model model) {
		 model.addAttribute("rightFrameSrc", "/hand1");
		 return "/source/showS";
		}
	
	 @GetMapping("/gofootMain") 
	 public String GoFoot(Model model) {
		 model.addAttribute("rightFrameSrc", "/foot1");
		 return "/source/showS";
		}
	 
	 	@GetMapping("/head1")
		public String ShowHead1() {
			return "/anatomy/headf/head1";
		}
	 	@GetMapping("/head2")
		public String ShowHead2() {
			return "/anatomy/headf/head2";
		}
	 	@GetMapping("/head3")
		public String ShowHead3() {
			return "/anatomy/headf/head3";
		}
	 	@GetMapping("/head4")
		public String ShowHead4() {
			return "/anatomy/headf/head4";
		}
	 	
		@GetMapping("/neck1")
		public String ShowNeck1() {
			return "/anatomy/neckf/neck1";
		}
		@GetMapping("/neck2")
		public String ShowNeck2() {
			return "/anatomy/neckf/neck2";
		}
		@GetMapping("/neck3")
		public String ShowNeck3() {
			return "/anatomy/neckf/neck3";
		}
		
		@GetMapping("/chest1")
		public String ShowChest1() {
			return "/anatomy/chestf/chest1";
		}
		@GetMapping("/chest2")
		public String ShowChest2() {
			return "/anatomy/chestf/chest2";
		}
		@GetMapping("/chest3")
		public String ShowChest3() {
			return "/anatomy/chestf/chest3";
		}
		@GetMapping("/chest4")
		public String ShowChest4() {
			return "/anatomy/chestf/chest4";
		}
		
		@GetMapping("/shoulder1")
		public String ShowShoulder1() {
			return "/anatomy/shoulderf/shoulder1";
		}
		@GetMapping("/shoulder2")
		public String ShowShoulder2() {
			return "/anatomy/shoulderf/shoulder2";
		}
		
		@GetMapping("/stomach1")
		public String ShowStomach1() {
			return "/anatomy/stomachf/stomach1";
		}
		@GetMapping("/stomach2")
		public String ShowStomach2() {
			return "/anatomy/stomachf/stomach2";
		}
		@GetMapping("/leg1")
		public String ShowLeg1() {
			return "/anatomy/legf/leg1";
		}
		@GetMapping("/leg2")
		public String ShowLeg2() {
			return "/anatomy/legf/leg2";
		}
		@GetMapping("/leg3")
		public String ShowLeg3() {
			return "/anatomy/legf/leg3";
		}
		
		@GetMapping("/knee1")
		public String ShowKnee1() {
			return "/anatomy/kneef/knee1";
		}
		@GetMapping("/knee2")
		public String ShowKnee2() {
			return "/anatomy/kneef/knee2";
		}
		@GetMapping("/knee3")
		public String ShowKnee3() {
			return "/anatomy/kneef/knee3";
		}
		
		@GetMapping("/hand1")
		public String ShowHand1() {
			return "/anatomy/handf/hand1";
		}
		@GetMapping("/hand2")
		public String ShowHand2() {
			return "/anatomy/handf/hand2";
		}
		@GetMapping("/hand3")
		public String ShowHand3() {
			return "/anatomy/handf/hand3";
		}
		
		@GetMapping("/foot1")
		public String ShowFoot1() {
			return "/anatomy/footf/foot1";
		}
		@GetMapping("/foot2")
		public String ShowFoot2() {
			return "/anatomy/footf/foot2";
		}
		@GetMapping("/foot3")
		public String ShowFoot3() {
			return "/anatomy/footf/foot3";
		}
}
