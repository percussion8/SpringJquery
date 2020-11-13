package com.korea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.domain.GreenVO;
import com.korea.service.GreenService;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Controller
@AllArgsConstructor
@RequestMapping("/green")
public class GreenController {
	@Setter(onMethod_=@Autowired)
	private GreenService service;
	
	@GetMapping("/list")
	public void greenlist(Model model) {
		model.addAttribute("greens", service.getListGreen());
	}
	
	@GetMapping("/one")
	public void oneGreen(@RequestParam("gid")Long gid, Model model) {
		System.out.println("번호 들어오는것 확인~: " + gid);
		model.addAttribute("one", service.getOneGreen(gid));
	}
	
	@PostMapping("/modify")
	public String updateGreen(GreenVO vo) {
		System.out.println(vo);
		service.modGreed(vo);
		return "redirect:/green/list";
	}
	
	@GetMapping("/merge")
	public void repeat(Model model) {
		model.addAttribute("merges", service.getMergs());
	}
	
	@PostMapping("/merge")
	public String repeatinsert(@RequestParam("one")String one, @RequestParam("two")String two, @RequestParam("repeat")int a) {
		System.out.println(one);
		System.out.println(two);
		System.out.println(a);
		service.repeatM(one, two, a);
		return "redirect:/green/merge"; 
	}

}
